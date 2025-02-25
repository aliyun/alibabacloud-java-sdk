// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of instances that you want to create. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    /**
     * <p>The type of the Elastic Compute Service (ECS) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.s6-c1m2.xlarge</p>
     */
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    /**
     * <p>The custom service tag.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The size of the system disk. Unit: GiB. Valid values: 200 to 2000. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The user-defined information. This parameter is not in use.</p>
     * 
     * <strong>example:</strong>
     * <p>x112223333</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The zone to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static CreateResourceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInstancesRequest self = new CreateResourceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceInstancesRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateResourceInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateResourceInstancesRequest setEcsInstanceCount(Integer ecsInstanceCount) {
        this.ecsInstanceCount = ecsInstanceCount;
        return this;
    }
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    public CreateResourceInstancesRequest setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public CreateResourceInstancesRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public CreateResourceInstancesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateResourceInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateResourceInstancesRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
