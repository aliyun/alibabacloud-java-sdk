// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneByEventRequest extends TeaModel {
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlertSceneByEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneByEventRequest self = new DescribeAlertSceneByEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneByEventRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeAlertSceneByEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
