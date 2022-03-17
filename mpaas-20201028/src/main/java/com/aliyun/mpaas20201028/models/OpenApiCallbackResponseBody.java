// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public String resultContent;

    public static OpenApiCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiCallbackResponseBody self = new OpenApiCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiCallbackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenApiCallbackResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

}
