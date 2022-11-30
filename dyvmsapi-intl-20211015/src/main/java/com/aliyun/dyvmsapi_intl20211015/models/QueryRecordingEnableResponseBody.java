// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class QueryRecordingEnableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryRecordingEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordingEnableResponseBody self = new QueryRecordingEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordingEnableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordingEnableResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QueryRecordingEnableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRecordingEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
