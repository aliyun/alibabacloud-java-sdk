// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetSwitchUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Url")
    public String url;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSwitchUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchUrlResponseBody self = new GetSwitchUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSwitchUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetSwitchUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSwitchUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
