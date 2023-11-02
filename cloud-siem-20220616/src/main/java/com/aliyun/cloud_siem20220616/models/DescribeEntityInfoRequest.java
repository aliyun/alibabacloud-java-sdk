// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("EntityIdentity")
    public String entityIdentity;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    public static DescribeEntityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntityInfoRequest self = new DescribeEntityInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEntityInfoRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeEntityInfoRequest setEntityIdentity(String entityIdentity) {
        this.entityIdentity = entityIdentity;
        return this;
    }
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    public DescribeEntityInfoRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeEntityInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEntityInfoRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

}
