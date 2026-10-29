// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetChunkResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call is successful. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The chunk details, including the body content, position, and enabled status.</p>
     */
    @NameInMap("Data")
    public KnowledgeBaseChunk data;

    /**
     * <p>The response message. If the call is successful, the value is Operation success. If the call fails, a specific error description is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetChunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChunkResponseBody self = new GetChunkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChunkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChunkResponseBody setData(KnowledgeBaseChunk data) {
        this.data = data;
        return this;
    }
    public KnowledgeBaseChunk getData() {
        return this.data;
    }

    public GetChunkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChunkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
