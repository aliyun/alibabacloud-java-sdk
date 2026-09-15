// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyConnectorRequest extends TeaModel {
    /**
     * <p>The validation request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public VerifyConnectorRequestBody body;

    public static VerifyConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyConnectorRequest self = new VerifyConnectorRequest();
        return TeaModel.build(map, self);
    }

    public VerifyConnectorRequest setBody(VerifyConnectorRequestBody body) {
        this.body = body;
        return this;
    }
    public VerifyConnectorRequestBody getBody() {
        return this.body;
    }

    public static class VerifyConnectorRequestBody extends TeaModel {
        /**
         * <p>A JSON string. qodercli uses apiKey. This parameter is used only for validation and is not persisted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;,&quot;apiKey&quot;:&quot;ak-xxxx&quot;,&quot;serviceAccountKeys&quot;:[{&quot;name&quot;:&quot;default&quot;,&quot;serviceAccountKey&quot;:&quot;sk-xxxx&quot;}]}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        public static VerifyConnectorRequestBody build(java.util.Map<String, ?> map) throws Exception {
            VerifyConnectorRequestBody self = new VerifyConnectorRequestBody();
            return TeaModel.build(map, self);
        }

        public VerifyConnectorRequestBody setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

    }

}
