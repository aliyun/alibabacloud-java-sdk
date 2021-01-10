// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class GetWebHostingConfigRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static GetWebHostingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebHostingConfigRequest self = new GetWebHostingConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetWebHostingConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
