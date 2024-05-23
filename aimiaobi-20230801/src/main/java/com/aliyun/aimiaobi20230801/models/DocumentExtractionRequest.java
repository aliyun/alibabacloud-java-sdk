// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DocumentExtractionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Urls")
    public java.util.List<String> urls;

    public static DocumentExtractionRequest build(java.util.Map<String, ?> map) throws Exception {
        DocumentExtractionRequest self = new DocumentExtractionRequest();
        return TeaModel.build(map, self);
    }

    public DocumentExtractionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DocumentExtractionRequest setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

}
