// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AuthKey")
    @Validation(required = true)
    public String authKey;

    public static CreateAuthKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyResponse self = new CreateAuthKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuthKeyResponse setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

}
