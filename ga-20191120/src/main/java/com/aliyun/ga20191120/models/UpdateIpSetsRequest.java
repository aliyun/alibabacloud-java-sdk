// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetsRequest extends TeaModel {
    /**
     * <p>The acceleration regions.</p>
     */
    @NameInMap("IpSets")
    public java.util.List<UpdateIpSetsRequestIpSets> ipSets;

    /**
     * <p>The region ID of the Global Accelerator (GA) instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetsRequest self = new UpdateIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetsRequest setIpSets(java.util.List<UpdateIpSetsRequestIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<UpdateIpSetsRequestIpSets> getIpSets() {
        return this.ipSets;
    }

    public UpdateIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateIpSetsRequestIpSets extends TeaModel {
        /**
         * <p>The new bandwidth of the acceleration region. Unit: Mbit/s.</p>
         * <br>
         * <p>You can specify the bandwidth for up to 100 acceleration regions.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the acceleration region that you want to modify.</p>
         * <br>
         * <p>You can specify the IDs of up to 100 acceleration regions.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        public static UpdateIpSetsRequestIpSets build(java.util.Map<String, ?> map) throws Exception {
            UpdateIpSetsRequestIpSets self = new UpdateIpSetsRequestIpSets();
            return TeaModel.build(map, self);
        }

        public UpdateIpSetsRequestIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public UpdateIpSetsRequestIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

    }

}
