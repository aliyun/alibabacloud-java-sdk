// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetSnapshotLinkRequest extends TeaModel {
    @NameInMap("LinkId")
    public String linkId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetSnapshotLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotLinkRequest self = new GetSnapshotLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotLinkRequest setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public GetSnapshotLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
