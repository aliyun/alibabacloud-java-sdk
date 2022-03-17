// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiQueryActiveCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public String resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static OpenApiQueryActiveCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQueryActiveCodeResponseBody self = new OpenApiQueryActiveCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiQueryActiveCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiQueryActiveCodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenApiQueryActiveCodeResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public OpenApiQueryActiveCodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
