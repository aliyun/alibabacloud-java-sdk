// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListEntitiesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>host1****</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityUuid")
    public String entityUuid;

    @NameInMap("EntityUuids")
    public String entityUuids;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsMalwareEntity")
    public String isMalwareEntity;

    /**
     * <strong>example:</strong>
     * <p>aliyun.siem.sas.alert_tag.miner_software</p>
     */
    @NameInMap("MalwareType")
    public String malwareType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    @NameInMap("Tags")
    public String tags;

    public static ListEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesRequest self = new ListEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListEntitiesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListEntitiesRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public ListEntitiesRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListEntitiesRequest setEntityUuid(String entityUuid) {
        this.entityUuid = entityUuid;
        return this;
    }
    public String getEntityUuid() {
        return this.entityUuid;
    }

    public ListEntitiesRequest setEntityUuids(String entityUuids) {
        this.entityUuids = entityUuids;
        return this;
    }
    public String getEntityUuids() {
        return this.entityUuids;
    }

    public ListEntitiesRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public ListEntitiesRequest setIsMalwareEntity(String isMalwareEntity) {
        this.isMalwareEntity = isMalwareEntity;
        return this;
    }
    public String getIsMalwareEntity() {
        return this.isMalwareEntity;
    }

    public ListEntitiesRequest setMalwareType(String malwareType) {
        this.malwareType = malwareType;
        return this;
    }
    public String getMalwareType() {
        return this.malwareType;
    }

    public ListEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEntitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEntitiesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListEntitiesRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListEntitiesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
