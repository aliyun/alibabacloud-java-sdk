// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteOfficeSitesRequest extends TeaModel {
    /**
     * <p>The ID of the workspace that you want to delete. You can specify 1 to 100 IDs of workspaces.</p>
     */
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    /**
     * <p>The region ID of the workspace that you want to delete. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteOfficeSitesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfficeSitesRequest self = new DeleteOfficeSitesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOfficeSitesRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DeleteOfficeSitesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
