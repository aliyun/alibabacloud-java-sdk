// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetContextStoreAPIKeyResponseBody extends TeaModel {
    /**
     * <p>The name of the AgentSpace to which the API key belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-space</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The masked prefix of the API key (for example, sk-abcd****). For security purposes, the full plaintext is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-abcd****</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The name of the context store to which the API key belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>The creation time of the API key, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The display name of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>my-api-key</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region ID of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetContextStoreAPIKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextStoreAPIKeyResponseBody self = new GetContextStoreAPIKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextStoreAPIKeyResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetContextStoreAPIKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetContextStoreAPIKeyResponseBody setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public GetContextStoreAPIKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetContextStoreAPIKeyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetContextStoreAPIKeyResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetContextStoreAPIKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
