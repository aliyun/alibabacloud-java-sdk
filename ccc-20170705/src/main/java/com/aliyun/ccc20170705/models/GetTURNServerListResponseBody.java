// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNServerListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("TurnServerListConfig")
    public String turnServerListConfig;

    @NameInMap("Success")
    public Boolean success;

    public static GetTURNServerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTURNServerListResponseBody self = new GetTURNServerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTURNServerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTURNServerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTURNServerListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTURNServerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTURNServerListResponseBody setTurnServerListConfig(String turnServerListConfig) {
        this.turnServerListConfig = turnServerListConfig;
        return this;
    }
    public String getTurnServerListConfig() {
        return this.turnServerListConfig;
    }

    public GetTURNServerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
