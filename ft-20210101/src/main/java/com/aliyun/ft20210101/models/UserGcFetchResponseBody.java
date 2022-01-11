// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class UserGcFetchResponseBody extends TeaModel {
    // Body
    @NameInMap("Body")
    public String body;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // RequestURL
    @NameInMap("RequestURL")
    public String requestURL;

    public static UserGcFetchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserGcFetchResponseBody self = new UserGcFetchResponseBody();
        return TeaModel.build(map, self);
    }

    public UserGcFetchResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UserGcFetchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserGcFetchResponseBody setRequestURL(String requestURL) {
        this.requestURL = requestURL;
        return this;
    }
    public String getRequestURL() {
        return this.requestURL;
    }

}
