// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeCustomAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>16B78383-2803-4964-9605-37B30C073B0E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DescribeCustomAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAnalysisTaskResponseBody self = new DescribeCustomAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomAnalysisTaskResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
