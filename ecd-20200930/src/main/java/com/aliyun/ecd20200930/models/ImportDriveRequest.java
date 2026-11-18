// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ImportDriveRequest extends TeaModel {
    /**
     * <p>The target UPM domain ID. For workspace scenarios, use the UpmDomainId instead of the NAS file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dom-aaaa****</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The target ECD end user ID. The caller account is obtained from the authentication context.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>Specifies whether to force an update. Default value: false. If the file already exists and this parameter is set to false, the request fails. If this parameter is set to true, the original DriveId is reused for the update.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceUpdate")
    public Boolean forceUpdate;

    /**
     * <p>The relative path of the cloud application UPM. It must be the same as the path specified during upload authorization. For cloud desktops, do not pass this parameter or pass an empty value.</p>
     * 
     * <strong>example:</strong>
     * <p>appv1/ab****</p>
     */
    @NameInMap("MountUrl")
    public String mountUrl;

    /**
     * <p>The target platform. Valid values: WINDOWS_10, WINDOWS_11, WINDOWS_SERVER_2019, WINDOWS_SERVER_2022, and WINDOWS_SERVER_2025.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WINDOWS_SERVER_2025</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region of the target UPM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ImportDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDriveRequest self = new ImportDriveRequest();
        return TeaModel.build(map, self);
    }

    public ImportDriveRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ImportDriveRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ImportDriveRequest setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public ImportDriveRequest setMountUrl(String mountUrl) {
        this.mountUrl = mountUrl;
        return this;
    }
    public String getMountUrl() {
        return this.mountUrl;
    }

    public ImportDriveRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ImportDriveRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
