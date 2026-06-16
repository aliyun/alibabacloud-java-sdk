// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeVersionsResult extends TeaModel {
    /**
     * <p>Indicates whether the request succeeded. A value of <code>SUCCESS</code> is returned on success. Otherwise, an error type is returned, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Contains the list of agent runtime versions.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListAgentRuntimeVersionsOutput data;

    /**
     * <p>A unique request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAgentRuntimeVersionsResult build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeVersionsResult self = new ListAgentRuntimeVersionsResult();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeVersionsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentRuntimeVersionsResult setData(ListAgentRuntimeVersionsOutput data) {
        this.data = data;
        return this;
    }
    public ListAgentRuntimeVersionsOutput getData() {
        return this.data;
    }

    public ListAgentRuntimeVersionsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
