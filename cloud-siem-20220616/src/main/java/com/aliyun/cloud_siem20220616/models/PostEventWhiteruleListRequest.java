// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostEventWhiteruleListRequest extends TeaModel {
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WhiteruleList")
    public String whiteruleList;

    public static PostEventWhiteruleListRequest build(java.util.Map<String, ?> map) throws Exception {
        PostEventWhiteruleListRequest self = new PostEventWhiteruleListRequest();
        return TeaModel.build(map, self);
    }

    public PostEventWhiteruleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public PostEventWhiteruleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostEventWhiteruleListRequest setWhiteruleList(String whiteruleList) {
        this.whiteruleList = whiteruleList;
        return this;
    }
    public String getWhiteruleList() {
        return this.whiteruleList;
    }

}
