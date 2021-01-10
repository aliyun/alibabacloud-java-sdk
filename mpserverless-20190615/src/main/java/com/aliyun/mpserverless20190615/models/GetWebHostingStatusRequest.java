// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingStatusRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static GetWebHostingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingStatusRequest self = new GetWebHostingStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetWebHostingStatusRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
