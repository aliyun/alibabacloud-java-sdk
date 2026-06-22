// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class SystemDisk extends TeaModel {
    /**
     * <p>The type of the system disk. Valid values:</p>
     * <ul>
     * <li><p><code>cloud_efficiency</code>: Ultra Disk.</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: SSD Cloud Disk.</p>
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
     * <p>Specifies the number of system disks on each node. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The performance level of the ESSD. This parameter is valid only when <code>Category</code> is set to <code>cloud_essd</code>. Valid values:</p>
     * <ul>
     * <li><p><code>PL0</code>: Up to 10,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><code>PL1</code> (default): Up to 50,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><code>PL2</code>: Up to 100,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><code>PL3</code>: Up to 1,000,000 random read/write IOPS per disk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The size of the system disk, in GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
        SystemDisk self = new SystemDisk();
        return TeaModel.build(map, self);
    }

    public SystemDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SystemDisk setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public SystemDisk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public SystemDisk setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
