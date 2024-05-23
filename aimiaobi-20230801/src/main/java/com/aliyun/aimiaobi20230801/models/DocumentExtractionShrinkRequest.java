// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DocumentExtractionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Urls")
    public String urlsShrink;

    public static DocumentExtractionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DocumentExtractionShrinkRequest self = new DocumentExtractionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DocumentExtractionShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DocumentExtractionShrinkRequest setUrlsShrink(String urlsShrink) {
        this.urlsShrink = urlsShrink;
        return this;
    }
    public String getUrlsShrink() {
        return this.urlsShrink;
    }

}
