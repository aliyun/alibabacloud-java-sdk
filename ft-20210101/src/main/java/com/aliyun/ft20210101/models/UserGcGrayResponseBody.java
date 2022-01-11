// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class UserGcGrayResponseBody extends TeaModel {
    // Body
    @NameInMap("Body")
    public String body;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // RequestURL
    @NameInMap("RequestURL")
    public String requestURL;

    public static UserGcGrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserGcGrayResponseBody self = new UserGcGrayResponseBody();
        return TeaModel.build(map, self);
    }

    public UserGcGrayResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UserGcGrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserGcGrayResponseBody setRequestURL(String requestURL) {
        this.requestURL = requestURL;
        return this;
    }
    public String getRequestURL() {
        return this.requestURL;
    }

}
