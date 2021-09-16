// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Region")
    public String region;

    @NameInMap("DestinationRegion")
    public String destinationRegion;

    @NameInMap("RegionId")
    public String regionId;

    public static WhiteIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListRequest self = new WhiteIpListRequest();
        return TeaModel.build(map, self);
    }

    public WhiteIpListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WhiteIpListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public WhiteIpListRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public WhiteIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
