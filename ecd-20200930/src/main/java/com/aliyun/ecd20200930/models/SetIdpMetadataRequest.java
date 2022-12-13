// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataRequest extends TeaModel {
    // The ID of the directory.
    @NameInMap("DirectoryId")
    public String directoryId;

    // The metadata of the IdP.
    @NameInMap("IdpMetadata")
    public String idpMetadata;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static SetIdpMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataRequest self = new SetIdpMetadataRequest();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetIdpMetadataRequest setIdpMetadata(String idpMetadata) {
        this.idpMetadata = idpMetadata;
        return this;
    }
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

    public SetIdpMetadataRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetIdpMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
