// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    public static GetSpMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataRequest self = new GetSpMetadataRequest();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
