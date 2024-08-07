// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEntityInfoRequest extends TeaModel {
    /**
     * <p>The logical ID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The feature value of the entity. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test22.php</p>
     */
    @NameInMap("EntityIdentity")
    public String entityIdentity;

    /**
     * <p>The UUID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The ID of the SOAR handling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>577bbf90-a770-44a7-8154-586aa2d318fa</p>
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

    public DescribeEntityInfoRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeEntityInfoRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeEntityInfoRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

}
