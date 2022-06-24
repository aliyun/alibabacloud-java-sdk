// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class MssOpenApiCreateSingleDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static MssOpenApiCreateSingleDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MssOpenApiCreateSingleDataResponseBody self = new MssOpenApiCreateSingleDataResponseBody();
        return TeaModel.build(map, self);
    }

    public MssOpenApiCreateSingleDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MssOpenApiCreateSingleDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MssOpenApiCreateSingleDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
