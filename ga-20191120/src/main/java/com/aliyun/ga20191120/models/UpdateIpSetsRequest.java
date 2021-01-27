// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("IpSets")
    public java.util.List<UpdateIpSetsRequestIpSets> ipSets;

    public static UpdateIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetsRequest self = new UpdateIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIpSetsRequest setIpSets(java.util.List<UpdateIpSetsRequestIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<UpdateIpSetsRequestIpSets> getIpSets() {
        return this.ipSets;
    }

    public static class UpdateIpSetsRequestIpSets extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

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
