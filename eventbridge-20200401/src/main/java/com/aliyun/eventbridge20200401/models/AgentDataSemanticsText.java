// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AgentDataSemanticsText extends TeaModel {
    /**
     * <p>The content of the Markdown-formatted text knowledge.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <h2>Data description</h2>
     */
    @NameInMap("Content")
    public String content;

    public static AgentDataSemanticsText build(java.util.Map<String, ?> map) throws Exception {
        AgentDataSemanticsText self = new AgentDataSemanticsText();
        return TeaModel.build(map, self);
    }

    public AgentDataSemanticsText setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
