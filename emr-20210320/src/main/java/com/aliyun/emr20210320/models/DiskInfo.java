// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DiskInfo extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("Size")
    public Integer size;

    public static DiskInfo build(java.util.Map<String, ?> map) throws Exception {
        DiskInfo self = new DiskInfo();
        return TeaModel.build(map, self);
    }

    public DiskInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DiskInfo setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DiskInfo setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public DiskInfo setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
