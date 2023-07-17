// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SendMseIncidentRequest extends TeaModel {
    @NameInMap("Incidents")
    public String incidents;

    @NameInMap("RegionId")
    public String regionId;

    public static SendMseIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMseIncidentRequest self = new SendMseIncidentRequest();
        return TeaModel.build(map, self);
    }

    public SendMseIncidentRequest setIncidents(String incidents) {
        this.incidents = incidents;
        return this;
    }
    public String getIncidents() {
        return this.incidents;
    }

    public SendMseIncidentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
