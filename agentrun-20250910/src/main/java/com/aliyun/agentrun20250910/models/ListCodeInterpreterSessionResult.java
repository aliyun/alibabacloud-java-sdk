// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpreterSessionResult extends TeaModel {
    /**
     * <p>The request status. A value of SUCCESS indicates that the request succeeded. Other values include error codes such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, and <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Contains the list of code interpreter sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public CodeInterpreterSessionListOut data;

    /**
     * <p>Unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListCodeInterpreterSessionResult build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpreterSessionResult self = new ListCodeInterpreterSessionResult();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpreterSessionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCodeInterpreterSessionResult setData(CodeInterpreterSessionListOut data) {
        this.data = data;
        return this;
    }
    public CodeInterpreterSessionListOut getData() {
        return this.data;
    }

    public ListCodeInterpreterSessionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
