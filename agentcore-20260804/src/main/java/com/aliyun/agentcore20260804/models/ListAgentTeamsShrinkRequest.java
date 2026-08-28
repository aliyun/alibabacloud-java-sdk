// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentTeamsShrinkRequest extends TeaModel {
    /**
     * <p>The request parameters for querying the agent team list.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static ListAgentTeamsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentTeamsShrinkRequest self = new ListAgentTeamsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentTeamsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
