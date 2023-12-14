// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoRequest extends TeaModel {
    /**
     * <p>The logical ID of the entity.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The feature value of the entity. Fuzzy match is supported.</p>
     */
    @NameInMap("EntityIdentity")
    public String entityIdentity;

    /**
     * <p>The UUID of the event.</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SOAR handling policy.</p>
     */
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
