// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Disk extends TeaModel {
    /**
     * <p>磁盘类型。</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>每个节点磁盘数量。</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>性能级别。</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>单位GB。</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static Disk build(java.util.Map<String, ?> map) throws Exception {
        Disk self = new Disk();
        return TeaModel.build(map, self);
    }

    public Disk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Disk setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public Disk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public Disk setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
