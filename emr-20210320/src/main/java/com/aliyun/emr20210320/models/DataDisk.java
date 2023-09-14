// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
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
     * <p>创建ESSD云盘作为数据盘使用时，设置云盘的性能等级。取值范围：</p>
     * <p>- PL0：单盘最高随机读写IOPS 1万。</p>
     * <p>- PL1（默认）：单盘最高随机读写IOPS 5万。</p>
     * <p>- PL2：单盘最高随机读写IOPS 10万。</p>
     * <p>- PL3：单盘最高随机读写IOPS 100万。</p>
     * <br>
     * <p>默认值：PL1。</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>单位GB。</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    public DataDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataDisk setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DataDisk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public DataDisk setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
