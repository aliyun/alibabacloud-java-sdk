// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSDGRequest extends TeaModel {
    /**
     * <p>The billing logic for SDG child disks. This parameter specifies the billing method for the RBD child disks produced by this SDG. This parameter does not apply to standard cloud disks.
     * Optional parameter values:</p>
     * <ul>
     * <li><p>Hour.</p>
     * </li>
     * <li><p>Day. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Parameter description: The longer the cycle, the lower the cost. If the disk is released before the billing cycle ends, a service fee is charged.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The description of the SDG.</p>
     * <blockquote>
     * <p>Provide a detailed description for easier future queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test SDG</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the source disk.
     * Optional parameter values:</p>
     * <ul>
     * <li>standard: standard cloud disk. This is the default value.</li>
     * <li>rbd: RBD disk.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Limits: RBD disk SDGs and standard disk SDGs cannot inherit from each other.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of an existing SDG.</p>
     * <blockquote>
     * <ul>
     * <li>If you are creating an SDG for the first time, leave <strong>FromSDGId</strong> empty.</li>
     * <li>If <strong>FromSDGId</strong> is invalid or the corresponding raw cloud disk cannot be found, an error is returned.</li>
     * <li>If <strong>FromSDGId</strong> is not empty, this indicates that you are operating on an existing SDG rather than creating one for the first time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("FromSDGId")
    public String fromSDGId;

    /**
     * <p>The AIC instance ID. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to obtain the InstanceId value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SDG sharing ratio parameter. This parameter supports cloud disks with different maximum sharing ratios.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PerformanceLevel")
    public Long performanceLevel;

    /**
     * <p>The maximum capacity of the SDG. Unit: GB.</p>
     * <blockquote>
     * <ul>
     * <li>To reduce costs, evaluate the required capacity as needed.</li>
     * <li>If you are creating an SDG for the first time, <strong>Size</strong> is required.</li>
     * <li>If the data volume increases later, pass a new <strong>Size</strong> value to expand the capacity. If <strong>Size</strong> is not empty and is greater than the original <strong>Size</strong> value of the SDG, the raw cloud disk of the SDG is expanded to the specified <strong>Size</strong>. If <strong>Size</strong> is empty or the specified <strong>Size</strong> is less than the original <strong>Size</strong> value of the SDG, no action is taken.</li>
     * </ul>
     * </blockquote>
     * <p>The minimum tested usable value is 150 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Size")
    public String size;

    public static CreateSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSDGRequest self = new CreateSDGRequest();
        return TeaModel.build(map, self);
    }

    public CreateSDGRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public CreateSDGRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSDGRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateSDGRequest setFromSDGId(String fromSDGId) {
        this.fromSDGId = fromSDGId;
        return this;
    }
    public String getFromSDGId() {
        return this.fromSDGId;
    }

    public CreateSDGRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSDGRequest setPerformanceLevel(Long performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public Long getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CreateSDGRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
