// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthResponseBody extends TeaModel {
    @NameInMap("AccessLogAuth")
    public Boolean accessLogAuth;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccessLogAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccessLogAuthResponseBody self = new CheckAccessLogAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccessLogAuthResponseBody setAccessLogAuth(Boolean accessLogAuth) {
        this.accessLogAuth = accessLogAuth;
        return this;
    }
    public Boolean getAccessLogAuth() {
        return this.accessLogAuth;
    }

    public CheckAccessLogAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
