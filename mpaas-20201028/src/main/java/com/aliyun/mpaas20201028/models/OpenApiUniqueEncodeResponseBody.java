// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUniqueEncodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public String resultContent;

    public static OpenApiUniqueEncodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUniqueEncodeResponseBody self = new OpenApiUniqueEncodeResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiUniqueEncodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiUniqueEncodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenApiUniqueEncodeResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

}
