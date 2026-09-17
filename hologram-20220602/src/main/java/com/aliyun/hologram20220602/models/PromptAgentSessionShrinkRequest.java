// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220602.models;

import com.aliyun.tea.*;

public class PromptAgentSessionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>product=HOLOGRES</p>
     */
    @NameInMap("Caller-Context")
    public String callerContext;

    /**
     * <strong>example:</strong>
     * <p>2072736942627512345</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    @NameInMap("Params")
    public String paramsShrink;

    public static PromptAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionShrinkRequest self = new PromptAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionShrinkRequest setCallerContext(String callerContext) {
        this.callerContext = callerContext;
        return this;
    }
    public String getCallerContext() {
        return this.callerContext;
    }

    public PromptAgentSessionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PromptAgentSessionShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public PromptAgentSessionShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
