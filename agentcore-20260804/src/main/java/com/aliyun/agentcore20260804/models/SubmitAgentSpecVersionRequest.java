// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SubmitAgentSpecVersionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public SubmitAgentSpecVersionRequestBody body;

    public static SubmitAgentSpecVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAgentSpecVersionRequest self = new SubmitAgentSpecVersionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAgentSpecVersionRequest setBody(SubmitAgentSpecVersionRequestBody body) {
        this.body = body;
        return this;
    }
    public SubmitAgentSpecVersionRequestBody getBody() {
        return this.body;
    }

    public static class SubmitAgentSpecVersionRequestBody extends TeaModel {
        public static SubmitAgentSpecVersionRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SubmitAgentSpecVersionRequestBody self = new SubmitAgentSpecVersionRequestBody();
            return TeaModel.build(map, self);
        }

    }

}
