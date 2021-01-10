// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetLicenseRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("LicenseUrl")
    public String licenseUrl;

    @NameInMap("Data")
    public String data;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("Header")
    public String header;

    @NameInMap("Type")
    public String type;

    public static GetLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseRequest self = new GetLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetLicenseRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetLicenseRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetLicenseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetLicenseRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetLicenseRequest setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
        return this;
    }
    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    public GetLicenseRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLicenseRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetLicenseRequest setHeader(String header) {
        this.header = header;
        return this;
    }
    public String getHeader() {
        return this.header;
    }

    public GetLicenseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
