// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetMallConfigResponseBody extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("Code")
    public Long code;

    @NameInMap("IsConfigured")
    public Boolean isConfigured;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public String params;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMallConfigResponseBody self = new GetMallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMallConfigResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMallConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMallConfigResponseBody setIsConfigured(Boolean isConfigured) {
        this.isConfigured = isConfigured;
        return this;
    }
    public Boolean getIsConfigured() {
        return this.isConfigured;
    }

    public GetMallConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMallConfigResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetMallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMallConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
