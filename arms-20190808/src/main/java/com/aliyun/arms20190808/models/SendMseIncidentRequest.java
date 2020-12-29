// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendMseIncidentRequest extends TeaModel {
    @NameInMap("Incidents")
    public String incidents;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

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

    public SendMseIncidentRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

}
