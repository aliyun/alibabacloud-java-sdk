// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAttackTimeLineRequest extends TeaModel {
    @NameInMap("AssetName")
    public String assetName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAttackTimeLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackTimeLineRequest self = new DescribeAttackTimeLineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackTimeLineRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeAttackTimeLineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAttackTimeLineRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeAttackTimeLineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAttackTimeLineRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
