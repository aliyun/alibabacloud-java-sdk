// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AbortCampaignResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AbortCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortCampaignResponseBody self = new AbortCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortCampaignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortCampaignResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AbortCampaignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
