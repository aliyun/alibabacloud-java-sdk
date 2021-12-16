// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PauseCampaignResponseBody extends TeaModel {
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

    public static PauseCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseCampaignResponseBody self = new PauseCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseCampaignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PauseCampaignResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PauseCampaignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
