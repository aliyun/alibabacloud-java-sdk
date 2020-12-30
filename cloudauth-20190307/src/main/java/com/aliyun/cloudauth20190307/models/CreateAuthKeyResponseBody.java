// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AuthKey")
    public String authKey;

    public static CreateAuthKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyResponseBody self = new CreateAuthKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAuthKeyResponseBody setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

}
