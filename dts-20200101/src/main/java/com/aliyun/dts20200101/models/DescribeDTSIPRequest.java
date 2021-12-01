// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDTSIPRequest extends TeaModel {
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    public static DescribeDTSIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTSIPRequest self = new DescribeDTSIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDTSIPRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public DescribeDTSIPRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDTSIPRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

}
