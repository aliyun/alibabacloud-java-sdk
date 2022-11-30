// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryServiceEnableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryServiceEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceEnableResponseBody self = new QueryServiceEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryServiceEnableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryServiceEnableResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QueryServiceEnableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryServiceEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
