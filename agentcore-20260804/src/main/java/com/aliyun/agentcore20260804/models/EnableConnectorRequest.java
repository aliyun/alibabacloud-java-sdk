// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class EnableConnectorRequest extends TeaModel {
    /**
     * <p>The enable request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public EnableConnectorRequestBody body;

    public static EnableConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableConnectorRequest self = new EnableConnectorRequest();
        return TeaModel.build(map, self);
    }

    public EnableConnectorRequest setBody(EnableConnectorRequestBody body) {
        this.body = body;
        return this;
    }
    public EnableConnectorRequestBody getBody() {
        return this.body;
    }

    public static class EnableConnectorRequestBody extends TeaModel {
        /**
         * <p>The Connector configuration JSON string. Set site to global or cn. apiKey is required. serviceAccountKeys must contain at least one named service account key. organizationId is optional.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;,&quot;apiKey&quot;:&quot;ak-xxxx&quot;,&quot;serviceAccountKeys&quot;:[{&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;sk-xxxx&quot;}]}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        public static EnableConnectorRequestBody build(java.util.Map<String, ?> map) throws Exception {
            EnableConnectorRequestBody self = new EnableConnectorRequestBody();
            return TeaModel.build(map, self);
        }

        public EnableConnectorRequestBody setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

    }

}
