// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdRequest extends TeaModel {
    /**
     * <p>Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.</p>
     * <br>
     * <p>You can use the monitoring tool that is provided by the asset to query the Internet traffic of the asset:</p>
     * <br>
     * <p>*   For more information about how to query the Internet traffic of an ECS instance, see [Query monitoring information of an instance](https://help.aliyun.com/document_detail/25482.html).</p>
     * <p>*   For more information about how to query the number of packets of an SLB instance, see [View monitoring data in the console](https://help.aliyun.com/document_detail/85982.html).</p>
     */
    @NameInMap("Bps")
    public Integer bps;

    /**
     * <p>The region ID of the asset for which you want to change the scrubbing thresholds.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The ID of the asset.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](https://help.aliyun.com/document_detail/354191.html) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
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
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>Specifies whether to automatically adjust the scrubbing threshold based on the traffic load on the asset. Valid values:</p>
     * <br>
     * <p>*   **true**: automatically adjusts the scrubbing thresholds. You do not need to configure the **Bps** and **Pps** parameters.</p>
     * <p>*   **false**: The scrubbing threshold is not automatically adjusted. You must configure the **Bps** and **Pps** parameters.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IsAuto")
    public Boolean isAuto;

    /**
     * <p>Specifies the packet scrubbing threshold. Unit: packets per second (pps).</p>
     * <br>
     * <p>The packet scrubbing threshold cannot exceed the peak number of inbound or outbound packets, whichever is larger, of the asset. You can use the monitoring tool that is provided by the asset to query the number of packets of the asset:</p>
     * <br>
     * <p>*   For more information about how to query the number of packets of an ECS instance, see [Query monitoring information of an instance](https://help.aliyun.com/document_detail/25482.html).</p>
     * <p>*   For more information about how to query the number of packets of an SLB instance, see [View monitoring data in the console](https://help.aliyun.com/document_detail/85982.html).</p>
     */
    @NameInMap("Pps")
    public Integer pps;

    public static ModifyDefenseThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseThresholdRequest self = new ModifyDefenseThresholdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseThresholdRequest setBps(Integer bps) {
        this.bps = bps;
        return this;
    }
    public Integer getBps() {
        return this.bps;
    }

    public ModifyDefenseThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public ModifyDefenseThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyDefenseThresholdRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifyDefenseThresholdRequest setIsAuto(Boolean isAuto) {
        this.isAuto = isAuto;
        return this;
    }
    public Boolean getIsAuto() {
        return this.isAuto;
    }

    public ModifyDefenseThresholdRequest setPps(Integer pps) {
        this.pps = pps;
        return this;
    }
    public Integer getPps() {
        return this.pps;
    }

}
