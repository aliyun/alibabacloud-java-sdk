// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNServerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TurnServerListConfig")
    public String turnServerListConfig;

    public static GetTURNServerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTURNServerListResponseBody self = new GetTURNServerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTURNServerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTURNServerListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTURNServerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTURNServerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTURNServerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTURNServerListResponseBody setTurnServerListConfig(String turnServerListConfig) {
        this.turnServerListConfig = turnServerListConfig;
        return this;
    }
    public String getTurnServerListConfig() {
        return this.turnServerListConfig;
    }

}
