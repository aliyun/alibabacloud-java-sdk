// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpDdosThresholdRequest extends TeaModel {
    /**
     * <p>The region ID of the asset.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The type of the threshold. Valid values:</p>
     * <br>
     * <p>*   **defense**: traffic scrubbing threshold</p>
     * <p>*   **blackhole**: DDoS mitigation threshold</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosType")
    public String ddosType;

    /**
     * <p>The ID of the asset.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIpAddress](https://help.aliyun.com/document_detail/429562.html) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <br>
     * <p>*   **ecs**: ECS instance</p>
     * <p>*   **slb**: SLB instance</p>
     * <p>*   **eip**: EIP</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The IP address of the asset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeIpDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpDdosThresholdRequest self = new DescribeIpDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeIpDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeIpDdosThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeIpDdosThresholdRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
