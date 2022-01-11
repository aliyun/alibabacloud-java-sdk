// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class UserGcSerivceGrayResponseBody extends TeaModel {
    @NameInMap("Body")
    public String body;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UserGcSerivceGrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserGcSerivceGrayResponseBody self = new UserGcSerivceGrayResponseBody();
        return TeaModel.build(map, self);
    }

    public UserGcSerivceGrayResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UserGcSerivceGrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
