// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceResponseBody self = new CreateSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSpaceResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
