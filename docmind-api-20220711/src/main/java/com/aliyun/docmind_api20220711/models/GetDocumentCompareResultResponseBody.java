// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentCompareResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Completed")
    public Boolean completed;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetDocumentCompareResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentCompareResultResponseBody self = new GetDocumentCompareResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentCompareResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentCompareResultResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public GetDocumentCompareResultResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetDocumentCompareResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentCompareResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentCompareResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
