// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>true/false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static PushDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushDocumentResponseBody self = new PushDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public PushDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushDocumentResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
