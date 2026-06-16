// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsResult extends TeaModel {
    /**
     * <p>The status code of the response. <code>SUCCESS</code> indicates that the operation succeeded. If the operation fails, an error code is returned, such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the agent runtime endpoints.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListAgentRuntimeEndpointsOutput data;

    /**
     * <p>A unique request identifier for troubleshooting purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAgentRuntimeEndpointsResult build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeEndpointsResult self = new ListAgentRuntimeEndpointsResult();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeEndpointsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentRuntimeEndpointsResult setData(ListAgentRuntimeEndpointsOutput data) {
        this.data = data;
        return this;
    }
    public ListAgentRuntimeEndpointsOutput getData() {
        return this.data;
    }

    public ListAgentRuntimeEndpointsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
