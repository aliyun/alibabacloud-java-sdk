// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListEntitiesRequest extends TeaModel {
    /**
     * <p>The page number of the current page. The value must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>host1****</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The entity type. Valid values:</p>
     * <ul>
     * <li>ip: IP address</li>
     * <li>domain: domain name</li>
     * <li>url: URL</li>
     * <li>process: process</li>
     * <li>file: file</li>
     * <li>host: host</li>
     * <li>cloud_account: cloud account</li>
     * <li>container: container</li>
     * <li>bucket: Object Storage Service (OSS) bucket.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The entity UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityUuid")
    public String entityUuid;

    /**
     * <p>The list of entity UUIDs.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****,6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityUuids")
    public String entityUuids;

    /**
     * <p>The incident ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>Specifies whether the entity is malicious. Valid values:</p>
     * <ul>
     * <li>0: No.</li>
     * <li>1: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsMalwareEntity")
    public String isMalwareEntity;

    /**
     * <p>The malicious entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun.siem.sas.alert_tag.miner_software</p>
     */
    @NameInMap("MalwareType")
    public String malwareType;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Select the region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the assets reside in the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: the assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The entity tags. The value is a JSON array string:</p>
     * <p><code>&quot;[{&quot;tagKey1&quot;:&quot;tagValue1&quot;},{&quot;tagKey2&quot;:&quot;tagValue2&quot;}]&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;tagKey1&quot;:&quot;tagValue1&quot;},{&quot;tagKey2&quot;:&quot;tagValue2&quot;}]</p>
     */
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
