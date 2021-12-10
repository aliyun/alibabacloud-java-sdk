// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AddGameToProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddGameToProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGameToProjectResponseBody self = new AddGameToProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGameToProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
