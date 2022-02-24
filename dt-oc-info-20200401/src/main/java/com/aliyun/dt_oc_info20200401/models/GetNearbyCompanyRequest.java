// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetNearbyCompanyRequest extends TeaModel {
    @NameInMap("CorpKey")
    public String corpKey;

    @NameInMap("Distance")
    public Float distance;

    @NameInMap("Lat")
    public Float lat;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Lon")
    public Float lon;

    @NameInMap("Offset")
    public Integer offset;

    public static GetNearbyCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNearbyCompanyRequest self = new GetNearbyCompanyRequest();
        return TeaModel.build(map, self);
    }

    public GetNearbyCompanyRequest setCorpKey(String corpKey) {
        this.corpKey = corpKey;
        return this;
    }
    public String getCorpKey() {
        return this.corpKey;
    }

    public GetNearbyCompanyRequest setDistance(Float distance) {
        this.distance = distance;
        return this;
    }
    public Float getDistance() {
        return this.distance;
    }

    public GetNearbyCompanyRequest setLat(Float lat) {
        this.lat = lat;
        return this;
    }
    public Float getLat() {
        return this.lat;
    }

    public GetNearbyCompanyRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetNearbyCompanyRequest setLon(Float lon) {
        this.lon = lon;
        return this;
    }
    public Float getLon() {
        return this.lon;
    }

    public GetNearbyCompanyRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

}
