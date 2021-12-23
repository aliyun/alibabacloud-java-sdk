// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsRequest extends TeaModel {
    // 云剪辑工程ID。支持多个云剪辑工程，以逗号分隔。
    @NameInMap("ProjectIds")
    public String projectIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEditingProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsRequest self = new DeleteEditingProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

    public DeleteEditingProjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
