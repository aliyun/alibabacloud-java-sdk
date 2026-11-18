// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDriveRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dom-aaaa****</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The ID of the user-level storage resource.</p>
     * 
     * <strong>example:</strong>
     * <p>dri-aaaa****</p>
     */
    @NameInMap("DriveId")
    public String driveId;

    /**
     * <p>The ID of the end user. This parameter is used when locating the UPM drive by using DomainId or OfficeSiteId.</p>
     * 
     * <strong>example:</strong>
     * <p>abc****</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDriveRequest self = new DeleteDriveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDriveRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DeleteDriveRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public DeleteDriveRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DeleteDriveRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DeleteDriveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
