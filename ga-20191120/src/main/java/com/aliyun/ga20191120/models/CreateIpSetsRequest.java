// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsRequest extends TeaModel {
    @NameInMap("AccelerateRegion")
    public java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsRequest self = new CreateIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsRequest setAccelerateRegion(java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }
    public java.util.List<CreateIpSetsRequestAccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    public CreateIpSetsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateIpSetsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateIpSetsRequestAccelerateRegion extends TeaModel {
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("IpVersion")
        public String ipVersion;

        public static CreateIpSetsRequestAccelerateRegion build(java.util.Map<String, ?> map) throws Exception {
            CreateIpSetsRequestAccelerateRegion self = new CreateIpSetsRequestAccelerateRegion();
            return TeaModel.build(map, self);
        }

        public CreateIpSetsRequestAccelerateRegion setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public CreateIpSetsRequestAccelerateRegion setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public CreateIpSetsRequestAccelerateRegion setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

    }

}
