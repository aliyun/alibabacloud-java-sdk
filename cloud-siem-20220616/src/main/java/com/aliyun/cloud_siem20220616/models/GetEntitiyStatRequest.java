// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetEntitiyStatRequest extends TeaModel {
    /**
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("AssetUuid")
    public String assetUuid;

    /**
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("EntityUuid")
    public String entityUuid;

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
     * <p>The asset ID associated with the incident.</p>
     * 
     * <strong>example:</strong>
     * <p>6c740667-80b2-476d-8924-2e706feb****</p>
     */
    @NameInMap("IsAsset")
    public String isAsset;

    /**
     * <p>The sort order of the incident list. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("IsMalwareEntity")
    public String isMalwareEntity;

    /**
     * <p>The region where the threat detection and response data management center resides. Select the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the asset belongs to the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: the asset belongs to a region outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>1637941677243702</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: single-account logon.</li>
     * <li>1: global view.</li>
     * <li>2: switched view.</li>
     * <li>3: partial view.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The entity tags. The value is a JSON array string in the following format: \&quot;[{\&quot;tagKey1\&quot;:\&quot;tagValue1\&quot;},{\&quot;tagKey2\&quot;:\&quot;tagValue2\&quot;}]\&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>sys:agent:dispose</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static GetEntitiyStatRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEntitiyStatRequest self = new GetEntitiyStatRequest();
        return TeaModel.build(map, self);
    }

    public GetEntitiyStatRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public GetEntitiyStatRequest setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
        return this;
    }
    public String getAssetUuid() {
        return this.assetUuid;
    }

    public GetEntitiyStatRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public GetEntitiyStatRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetEntitiyStatRequest setEntityUuid(String entityUuid) {
        this.entityUuid = entityUuid;
        return this;
    }
    public String getEntityUuid() {
        return this.entityUuid;
    }

    public GetEntitiyStatRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public GetEntitiyStatRequest setIsAsset(String isAsset) {
        this.isAsset = isAsset;
        return this;
    }
    public String getIsAsset() {
        return this.isAsset;
    }

    public GetEntitiyStatRequest setIsMalwareEntity(String isMalwareEntity) {
        this.isMalwareEntity = isMalwareEntity;
        return this;
    }
    public String getIsMalwareEntity() {
        return this.isMalwareEntity;
    }

    public GetEntitiyStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEntitiyStatRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public GetEntitiyStatRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public GetEntitiyStatRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
