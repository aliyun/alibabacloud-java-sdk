// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDriveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1202****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>dom-aaaa****</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("DriveName")
    public String driveName;

    /**
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("ExternalDomainId")
    public String externalDomainId;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ProfileRoaming")
    public Boolean profileRoaming;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>NAS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>USER_PROFILE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDriveRequest self = new CreateDriveRequest();
        return TeaModel.build(map, self);
    }

    public CreateDriveRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateDriveRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDriveRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public CreateDriveRequest setExternalDomainId(String externalDomainId) {
        this.externalDomainId = externalDomainId;
        return this;
    }
    public String getExternalDomainId() {
        return this.externalDomainId;
    }

    public CreateDriveRequest setProfileRoaming(Boolean profileRoaming) {
        this.profileRoaming = profileRoaming;
        return this;
    }
    public Boolean getProfileRoaming() {
        return this.profileRoaming;
    }

    public CreateDriveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDriveRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateDriveRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDriveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
