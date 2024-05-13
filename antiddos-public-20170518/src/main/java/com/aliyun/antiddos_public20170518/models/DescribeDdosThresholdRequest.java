// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdRequest extends TeaModel {
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
     * <p>The ID of asset N to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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

    public static DescribeDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdRequest self = new DescribeDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeDdosThresholdRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
