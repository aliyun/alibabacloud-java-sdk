// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    /**
     * <p>The disk type. Valid values:</p>
     * <ul>
     * <li><p><code>cloud_efficiency</code>: Ultra Disk.</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
     * </li>
     * <li><p><code>cloud_essd</code>: ESSD.</p>
     * </li>
     * <li><p><code>cloud</code>: Basic Disk.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The number of data disks.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The performance level of an ESSD. This parameter applies only when the <code>Category</code> parameter is set to <code>cloud_essd</code>. Valid values:</p>
     * <ul>
     * <li><p>PL0: A maximum of 10,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p>PL1: A maximum of 50,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p>PL2: A maximum of 100,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p>PL3: A maximum of 1,000,000 random read/write IOPS per disk.</p>
     * </li>
     * </ul>
     * <p>Default value: PL1.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The size of each data disk, in GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
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
