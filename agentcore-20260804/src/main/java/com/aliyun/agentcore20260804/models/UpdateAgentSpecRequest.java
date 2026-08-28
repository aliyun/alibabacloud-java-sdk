// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentSpecRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateAgentSpecRequestBody body;

    public static UpdateAgentSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSpecRequest self = new UpdateAgentSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSpecRequest setBody(UpdateAgentSpecRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentSpecRequestBody getBody() {
        return this.body;
    }

    public static class UpdateAgentSpecRequestBody extends TeaModel {
        /**
         * <p>The business tags as a JSON-formatted string.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ai&quot;,&quot;agent&quot;]</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        /**
         * <p>The label mapping as a JSON-formatted string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;latest&quot;:&quot;0.0.1&quot;}</p>
         */
        @NameInMap("labels")
        public String labels;

        /**
         * <p>The visibility scope. Valid values:</p>
         * <ul>
         * <li>PUBLIC</li>
         * <li>PRIVATE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("scope")
        public String scope;

        public static UpdateAgentSpecRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentSpecRequestBody self = new UpdateAgentSpecRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateAgentSpecRequestBody setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public UpdateAgentSpecRequestBody setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public UpdateAgentSpecRequestBody setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
