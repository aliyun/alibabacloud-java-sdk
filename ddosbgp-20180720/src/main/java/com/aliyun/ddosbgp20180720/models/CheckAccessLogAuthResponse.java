// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckAccessLogAuthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessLogAuth")
    @Validation(required = true)
    public Boolean accessLogAuth;

    public static CheckAccessLogAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccessLogAuthResponse self = new CheckAccessLogAuthResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccessLogAuthResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAccessLogAuthResponse setAccessLogAuth(Boolean accessLogAuth) {
        this.accessLogAuth = accessLogAuth;
        return this;
    }
    public Boolean getAccessLogAuth() {
        return this.accessLogAuth;
    }

}
