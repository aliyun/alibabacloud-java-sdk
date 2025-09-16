// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSDGRequest extends TeaModel {
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The description of the SDG.</p>
     * <blockquote>
     * <p> We recommend that you specify this parameter in details for subsequent queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Testing SDGs</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of the SDG from which you want to create an SDG.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The first time you create an SDG, the <strong>FromSDGId</strong> parameter is empty.</p>
     * </li>
     * <li><p>If the value of the <strong>FromSDGId</strong> parameter is invalid or does not correspond to an original disk, an error is reported.</p>
     * </li>
     * <li><p>If the value of the <strong>FromSDGId</strong> parameter is not empty, you have created an SDG, and the operation is performed on the existing SDG.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("FromSDGId")
    public String fromSDGId;

    /**
     * <p>The ID of the AIC instance. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PerformanceLevel")
    public Long performanceLevel;

    /**
     * <p>The maximum capacity of the SDG. Unit: GB.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To save costs, we recommend that you specify this parameter based on your business requirements.</p>
     * </li>
     * <li><p>The first time that you create an SDG, the <strong>Size</strong> parameter is required.</p>
     * </li>
     * <li><p>When the amount of data increases, you can pass a new <strong>Size</strong> parameter for resizing. If the value of the new <strong>Size</strong> parameter is greater than the value of the old <strong>Size</strong> parameter, the disk size of the SDG is increased to the size that is specified by the new <strong>Size</strong> parameter. If the value of the new <strong>Size</strong> parameter is empty or smaller than that of the old <strong>Size</strong> parameter, no operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
