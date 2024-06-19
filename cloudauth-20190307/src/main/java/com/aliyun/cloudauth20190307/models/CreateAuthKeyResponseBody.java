// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>auth.1KQMcnLd4m37LN2D0F0WCD-1qtQI$</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuthKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyResponseBody self = new CreateAuthKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyResponseBody setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateAuthKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
