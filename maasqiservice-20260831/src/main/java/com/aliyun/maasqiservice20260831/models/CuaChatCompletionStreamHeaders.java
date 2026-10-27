// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qis_<instance_api_key></p>
     */
    @NameInMap("X-QI-Agent-Api-Key")
    public String xQIAgentApiKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUA_<instance_id></p>
     */
    @NameInMap("X-QI-Instance-Id")
    public String xQIInstanceId;

    /**
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

    public CuaChatCompletionStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

}
