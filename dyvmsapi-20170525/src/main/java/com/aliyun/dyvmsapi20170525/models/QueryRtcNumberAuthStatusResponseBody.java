// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRtcNumberAuthStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Module")
    public String module;

    @NameInMap("Code")
    public String code;

    public static QueryRtcNumberAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRtcNumberAuthStatusResponseBody self = new QueryRtcNumberAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRtcNumberAuthStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRtcNumberAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRtcNumberAuthStatusResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryRtcNumberAuthStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
