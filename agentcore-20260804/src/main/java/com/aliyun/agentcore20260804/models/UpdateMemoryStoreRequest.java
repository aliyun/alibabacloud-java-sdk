// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryStoreRequest extends TeaModel {
    /**
     * <p>The update MemoryStore request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateMemoryStoreRequestBody body;

    /**
     * <p>The client request token.</p>
     * 
     * <strong>example:</strong>
     * <p>memory-store-update-20260909-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateMemoryStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryStoreRequest self = new UpdateMemoryStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryStoreRequest setBody(UpdateMemoryStoreRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryStoreRequestBody getBody() {
        return this.body;
    }

    public UpdateMemoryStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateMemoryStoreRequestBody extends TeaModel {
        /**
         * <p>The MemoryStore description, up to 1,024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Memory store used to save long-term customer preferences</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The custom memory extraction instructions, up to 4,096 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("extractInstructions")
        public String extractInstructions;

        public static UpdateMemoryStoreRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryStoreRequestBody self = new UpdateMemoryStoreRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryStoreRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMemoryStoreRequestBody setExtractInstructions(String extractInstructions) {
            this.extractInstructions = extractInstructions;
            return this;
        }
        public String getExtractInstructions() {
            return this.extractInstructions;
        }

    }

}
