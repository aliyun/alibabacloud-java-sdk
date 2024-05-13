// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapRequest extends TeaModel {
    /**
     * <p>The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <br>
     * <p>> You can call the [DescribeDdosEventList](https://help.aliyun.com/document_detail/354236.html) operation to query the start time of each DDoS attack event that occurred on an asset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BegTime")
    public Long begTime;

    /**
     * <p>The region ID of the asset that is under DDoS attacks. The asset is assigned a public IP address.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The ID of the asset that is under DDoS attacks.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](https://help.aliyun.com/document_detail/354191.html) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the asset that is under DDoS attacks. Valid values:</p>
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
     * <p>The public IP address of the asset that is under DDoS attacks.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    public static DescribeCapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapRequest self = new DescribeCapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapRequest setBegTime(Long begTime) {
        this.begTime = begTime;
        return this;
    }
    public Long getBegTime() {
        return this.begTime;
    }

    public DescribeCapRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeCapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCapRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeCapRequest setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

}
