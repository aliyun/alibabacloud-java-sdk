// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateConnectorRequest extends TeaModel {
    /**
     * <p>The update request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateConnectorRequestBody body;

    public static UpdateConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorRequest self = new UpdateConnectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorRequest setBody(UpdateConnectorRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnectorRequestBody getBody() {
        return this.body;
    }

    public static class UpdateConnectorRequestBody extends TeaModel {
        /**
         * <p>The Connector configuration JSON string. The site value must match the value specified when the Connector was enabled. The organizationId value, if provided, must match the value specified when the Connector was enabled. If apiKey is omitted, the original value is retained. If serviceAccountKeys is provided, it represents the complete updated key collection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
         */
        @NameInMap("metadata")
        public String metadata;

        public static UpdateConnectorRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectorRequestBody self = new UpdateConnectorRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateConnectorRequestBody setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

    }

}
