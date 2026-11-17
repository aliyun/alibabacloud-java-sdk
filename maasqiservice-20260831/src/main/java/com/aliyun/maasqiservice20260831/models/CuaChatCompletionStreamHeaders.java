// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The instance access key, which must match the instance. According to the original documentation, you can pass the original qis_ key or the Bearer format. It cannot replace the POP AK signature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qis_<instance_api_key></p>
     */
    @NameInMap("X-QI-Agent-Api-Key")
    public String xQIAgentApiKey;

    /**
     * <p>The ID of the target published CUA standard instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUA_<instance_id></p>
     */
    @NameInMap("X-QI-Instance-Id")
    public String xQIInstanceId;

    /**
     * <p>The request ID. We recommend that you explicitly generate it. Reuse it for retries of the same step, and use a new ID for a new step.</p>
     * 
     * <strong>example:</strong>
     * <p>request_id</p>
     */
    @NameInMap("X-QI-Request-Id")
    public String xQIRequestId;

    /**
     * <p>The session ID. It can be omitted in the first round. In subsequent rounds, reuse the qi_session_id returned in the body.</p>
     * 
     * <strong>example:</strong>
     * <p>session-cua-1</p>
     */
    @NameInMap("X-QI-Session-Id")
    public String xQISessionId;

    public static CuaChatCompletionStreamHeaders build(java.util.Map<String, ?> map) throws Exception {
        CuaChatCompletionStreamHeaders self = new CuaChatCompletionStreamHeaders();
        return TeaModel.build(map, self);
    }

    public CuaChatCompletionStreamHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CuaChatCompletionStreamHeaders setXQIAgentApiKey(String xQIAgentApiKey) {
        this.xQIAgentApiKey = xQIAgentApiKey;
        return this;
    }
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    public CuaChatCompletionStreamHeaders setXQIInstanceId(String xQIInstanceId) {
        this.xQIInstanceId = xQIInstanceId;
        return this;
    }
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    public CuaChatCompletionStreamHeaders setXQIRequestId(String xQIRequestId) {
        this.xQIRequestId = xQIRequestId;
        return this;
    }
    public String getXQIRequestId() {
        return this.xQIRequestId;
    }

    public CuaChatCompletionStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

}
