// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The metadata of the IdP.</p>
     */
    @NameInMap("IdpMetadata")
    public String idpMetadata;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
     */
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
