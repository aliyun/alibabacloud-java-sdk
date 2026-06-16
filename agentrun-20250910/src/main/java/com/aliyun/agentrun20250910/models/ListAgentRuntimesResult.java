// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesResult extends TeaModel {
    /**
     * <p>The status of the request. A value of <code>SUCCESS</code> indicates success. Otherwise, this field returns an error type, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of agent runtimes.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListAgentRuntimesOutput data;

    /**
     * <p>The unique ID of the request, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAgentRuntimesResult build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesResult self = new ListAgentRuntimesResult();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentRuntimesResult setData(ListAgentRuntimesOutput data) {
        this.data = data;
        return this;
    }
    public ListAgentRuntimesOutput getData() {
        return this.data;
    }

    public ListAgentRuntimesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
