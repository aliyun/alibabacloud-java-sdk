// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CameraChatCompletionStreamHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The access key of the specified Camera instance. Provide the raw value without the Bearer prefix. This key is not an AccessKey secret and cannot replace an OpenAPI signature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qis_xxx</p>
     */
    @NameInMap("X-QI-Agent-Api-Key")
    public String xQIAgentApiKey;

    /**
     * <p>The request ID. A trusted POP ID is preferred. If no trusted POP ID is available, this header is required. The <code>requestId</code> field in the request body is not accepted. For the format and retry rules, refer to the supplementary instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>camera-request-001</p>
     */
    @NameInMap("X-QI-Request-Id")
    public String xQIRequestId;

    /**
     * <p>The optional session ID. If omitted, a session ID is generated. Reuse the original value for continuation and successful replay. For the format and retrieval method, refer to the supplementary instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>camera-session-001</p>
     */
    @NameInMap("X-QI-Session-Id")
    public String xQISessionId;

    /**
     * <p>The ID of the published CameraStandard instance. This ID must correspond to the <code>X-QI-Agent-Api-Key</code> header. The recognition scene, model, and thresholds are derived from the published configuration of this instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CAMERA_xxx</p>
     */
    @NameInMap("x-QI-Instance-Id")
    public String xQIInstanceId;

    public static CameraChatCompletionStreamHeaders build(java.util.Map<String, ?> map) throws Exception {
        CameraChatCompletionStreamHeaders self = new CameraChatCompletionStreamHeaders();
        return TeaModel.build(map, self);
    }

    public CameraChatCompletionStreamHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CameraChatCompletionStreamHeaders setXQIAgentApiKey(String xQIAgentApiKey) {
        this.xQIAgentApiKey = xQIAgentApiKey;
        return this;
    }
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    public CameraChatCompletionStreamHeaders setXQIRequestId(String xQIRequestId) {
        this.xQIRequestId = xQIRequestId;
        return this;
    }
    public String getXQIRequestId() {
        return this.xQIRequestId;
    }

    public CameraChatCompletionStreamHeaders setXQISessionId(String xQISessionId) {
        this.xQISessionId = xQISessionId;
        return this;
    }
    public String getXQISessionId() {
        return this.xQISessionId;
    }

    public CameraChatCompletionStreamHeaders setXQIInstanceId(String xQIInstanceId) {
        this.xQIInstanceId = xQIInstanceId;
        return this;
    }
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

}
