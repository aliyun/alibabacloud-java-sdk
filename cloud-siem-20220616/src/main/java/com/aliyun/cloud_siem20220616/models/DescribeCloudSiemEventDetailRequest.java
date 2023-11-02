// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventDetailRequest extends TeaModel {
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudSiemEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventDetailRequest self = new DescribeCloudSiemEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventDetailRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeCloudSiemEventDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
