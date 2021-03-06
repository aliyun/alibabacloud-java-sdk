// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("AccelerateRegion")
    public java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion;

    public static CreateIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsRequest self = new CreateIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpSetsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpSetsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateIpSetsRequest setAccelerateRegion(java.util.List<CreateIpSetsRequestAccelerateRegion> accelerateRegion) {
        this.accelerateRegion = accelerateRegion;
        return this;
    }
    public java.util.List<CreateIpSetsRequestAccelerateRegion> getAccelerateRegion() {
        return this.accelerateRegion;
    }

    public static class CreateIpSetsRequestAccelerateRegion extends TeaModel {
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

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

        public CreateIpSetsRequestAccelerateRegion setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public CreateIpSetsRequestAccelerateRegion setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

    }

}
