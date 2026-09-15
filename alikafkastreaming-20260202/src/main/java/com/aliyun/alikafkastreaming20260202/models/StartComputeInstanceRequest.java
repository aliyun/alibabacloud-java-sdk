// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class StartComputeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_streaming-cn-pe333xxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>streaming-prod</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1abcdefg</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static StartComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartComputeInstanceRequest self = new StartComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartComputeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartComputeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public StartComputeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartComputeInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public StartComputeInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
