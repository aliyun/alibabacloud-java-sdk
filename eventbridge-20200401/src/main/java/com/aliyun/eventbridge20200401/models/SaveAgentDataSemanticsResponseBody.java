// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SaveAgentDataSemanticsResponseBody extends TeaModel {
    /**
     * <p>The response code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update result. If the save is successful, an empty object is returned with no additional business fields. If none of the four knowledge categories are specified, the target state is all four categories empty: if a non-empty current version exists, an all-empty version is published. If the current version is already all empty or no current version exists, the operation succeeds idempotently and the current round of pending generation results is finalized.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The response message. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid data semantics request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5DAF96FB-A4DF-548C-B8A1-F2A8D2F4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveAgentDataSemanticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAgentDataSemanticsResponseBody self = new SaveAgentDataSemanticsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAgentDataSemanticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveAgentDataSemanticsResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SaveAgentDataSemanticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveAgentDataSemanticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveAgentDataSemanticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
