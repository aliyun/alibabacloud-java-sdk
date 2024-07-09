// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataRequest extends TeaModel {
    /**
     * <p>The workspace ID. This parameter is the same as <code>OfficeSiteId</code>. We recommend that you use <code>OfficeSiteId</code> to replace <code>DirectoryId</code>. You can specify only <code>DirectoryId</code> or <code>OfficeSiteId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-400695****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

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

    public static GetSpMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataRequest self = new GetSpMetadataRequest();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetSpMetadataRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public GetSpMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
