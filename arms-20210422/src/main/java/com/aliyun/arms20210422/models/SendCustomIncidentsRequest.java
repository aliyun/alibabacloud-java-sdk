// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SendCustomIncidentsRequest extends TeaModel {
    @NameInMap("Incidents")
    public String incidents;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RegionId")
    public String regionId;

    public static SendCustomIncidentsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomIncidentsRequest self = new SendCustomIncidentsRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomIncidentsRequest setIncidents(String incidents) {
        this.incidents = incidents;
        return this;
    }
    public String getIncidents() {
        return this.incidents;
    }

    public SendCustomIncidentsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public SendCustomIncidentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
