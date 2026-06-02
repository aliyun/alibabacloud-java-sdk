// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class CreateUserAuthConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>uac-a2253c40486c40c1b910</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>249048A1-7FF7-5D2E-A322-695420112094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthConfigResponseBody self = new CreateUserAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateUserAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
