// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class GuiChatCompletionStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qis_xxx</p>
     */
    @NameInMap("X-QI-Agent-Api-Key")
    public String xQIAgentApiKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GUI_xxx</p>
     */
    @NameInMap("X-QI-Instance-Id")
    public String xQIInstanceId;

    /**
     * <strong>example:</strong>
     * <p>session-xxx</p>
     */
    @NameInMap("X-QI-Session-Id")
    public String xQISessionId;

    public static GuiChatCompletionStreamHeaders build(java.util.Map<String, ?> map) throws Exception {
        GuiChatCompletionStreamHeaders self = new GuiChatCompletionStreamHeaders();
        return TeaModel.build(map, self);
    }

    public GuiChatCompletionStreamHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GuiChatCompletionStreamHeaders setXQIAgentApiKey(String xQIAgentApiKey) {
        this.xQIAgentApiKey = xQIAgentApiKey;
        return this;
    }
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    public GuiChatCompletionStreamHeaders setXQIInstanceId(String xQIInstanceId) {
        this.xQIInstanceId = xQIInstanceId;
        return this;
    }
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    public GuiChatCompletionStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

}
