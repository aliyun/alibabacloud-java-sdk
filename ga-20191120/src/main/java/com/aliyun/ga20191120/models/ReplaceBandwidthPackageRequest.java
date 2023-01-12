// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the replacement bandwidth plan. When you specify a replacement bandwidth plan, take note of the following items:</p>
     * <br>
     * <p>*   Only a bandwidth plan that is not associated with a GA instance can be specified.</p>
     * <p>*   If you want to replace a basic bandwidth plan, make sure that the bandwidth provided by the replacement bandwidth plan is not less than the total bandwidth allocated to the acceleration area.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the bandwidth plan that you want to replace.</p>
     */
    @NameInMap("TargetBandwidthPackageId")
    public String targetBandwidthPackageId;

    public static ReplaceBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBandwidthPackageRequest self = new ReplaceBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceBandwidthPackageRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ReplaceBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ReplaceBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceBandwidthPackageRequest setTargetBandwidthPackageId(String targetBandwidthPackageId) {
        this.targetBandwidthPackageId = targetBandwidthPackageId;
        return this;
    }
    public String getTargetBandwidthPackageId() {
        return this.targetBandwidthPackageId;
    }

}
