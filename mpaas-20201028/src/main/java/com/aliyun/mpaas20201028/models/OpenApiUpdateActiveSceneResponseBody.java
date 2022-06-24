// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUpdateActiveSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public String resultContent;

    public static OpenApiUpdateActiveSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUpdateActiveSceneResponseBody self = new OpenApiUpdateActiveSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiUpdateActiveSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenApiUpdateActiveSceneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenApiUpdateActiveSceneResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

}
