// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataRequest extends TeaModel {
    /**
     * <p>The workspace ID. This parameter is the same as <code>OfficeSiteId</code>. We recommend that you use <code>OfficeSiteId</code> to replace <code>DirectoryId</code>. You can specify only <code>DirectoryId</code> or <code>OfficeSiteId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The metadata of the IdP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&lt;EntityDescriptor ID********Descriptor&gt;</p>
     */
    @NameInMap("IdpMetadata")
    public String idpMetadata;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
