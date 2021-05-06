// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("IdpMetadata")
    @Validation(required = true)
    public String idpMetadata;

    public static SetIdpMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataRequest self = new SetIdpMetadataRequest();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetIdpMetadataRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetIdpMetadataRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetIdpMetadataRequest setIdpMetadata(String idpMetadata) {
        this.idpMetadata = idpMetadata;
        return this;
    }
    public String getIdpMetadata() {
        return this.idpMetadata;
    }

}
