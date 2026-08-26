// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateModelRequestBody body;

    /**
     * <p>The client token for idempotence. Not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelRequest self = new UpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelRequest setBody(UpdateModelRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelRequestBody getBody() {
        return this.body;
    }

    public UpdateModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateModelRequestBody extends TeaModel {
        /**
         * <p>The model description. Maximum length: 255 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        public static UpdateModelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelRequestBody self = new UpdateModelRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateModelRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
