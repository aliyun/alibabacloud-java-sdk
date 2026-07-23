// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response body.</p>
     */
    @NameInMap("Data")
    public AskLumaResult data;

    /**
     * <p>The error message. This value is null if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent with name \&quot;xxx\&quot; not found for account 1186xxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>97FB3BAE-XXXXXX-36435495B7EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AskLumaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AskLumaResponseBody self = new AskLumaResponseBody();
        return TeaModel.build(map, self);
    }

    public AskLumaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AskLumaResponseBody setData(AskLumaResult data) {
        this.data = data;
        return this;
    }
    public AskLumaResult getData() {
        return this.data;
    }

    public AskLumaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AskLumaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AskLumaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
