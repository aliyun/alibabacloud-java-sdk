// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistResponse self = new CreateWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
