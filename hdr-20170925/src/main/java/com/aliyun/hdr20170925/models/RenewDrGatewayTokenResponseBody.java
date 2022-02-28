// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RenewDrGatewayTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PubToken")
    public String pubToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubToken")
    public String subToken;

    @NameInMap("Success")
    public Boolean success;

    public static RenewDrGatewayTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDrGatewayTokenResponseBody self = new RenewDrGatewayTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDrGatewayTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewDrGatewayTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenewDrGatewayTokenResponseBody setPubToken(String pubToken) {
        this.pubToken = pubToken;
        return this;
    }
    public String getPubToken() {
        return this.pubToken;
    }

    public RenewDrGatewayTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewDrGatewayTokenResponseBody setSubToken(String subToken) {
        this.subToken = subToken;
        return this;
    }
    public String getSubToken() {
        return this.subToken;
    }

    public RenewDrGatewayTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
