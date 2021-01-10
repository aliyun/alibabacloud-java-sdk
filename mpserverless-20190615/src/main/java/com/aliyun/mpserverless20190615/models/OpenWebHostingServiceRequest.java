// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenWebHostingServiceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static OpenWebHostingServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenWebHostingServiceRequest self = new OpenWebHostingServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenWebHostingServiceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
