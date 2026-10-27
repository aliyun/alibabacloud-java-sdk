// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class PaChatCompletionStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The Agent instance access key used for QICloud Customer API authentication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qis_xxx</p>
     */
    @NameInMap("X-QI-Agent-Api-Key")
    public String xQIAgentApiKey;

    /**
     * <p>The published Mobile Planner Agent instance ID. Must correspond to the X-QI-Agent-Api-Key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PA_xxx</p>
     */
    @NameInMap("X-QI-Instance-Id")
    public String xQIInstanceId;

    /**
     * <p>The optional session identifier. Can be omitted for the first turn, in which case the server generates one. Pass it back in subsequent turns to continue the Mobile Planner Agent session.</p>
     * 
     * <strong>example:</strong>
     * <p>session-xxx</p>
     */
    @NameInMap("X-QI-Session-Id")
    public String xQISessionId;

    public static PaChatCompletionStreamHeaders build(java.util.Map<String, ?> map) throws Exception {
        PaChatCompletionStreamHeaders self = new PaChatCompletionStreamHeaders();
        return TeaModel.build(map, self);
    }

    public PaChatCompletionStreamHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PaChatCompletionStreamHeaders setXQIAgentApiKey(String xQIAgentApiKey) {
        this.xQIAgentApiKey = xQIAgentApiKey;
        return this;
    }
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    public PaChatCompletionStreamHeaders setXQIInstanceId(String xQIInstanceId) {
        this.xQIInstanceId = xQIInstanceId;
        return this;
    }
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    public PaChatCompletionStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

}
