// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryStoreRequest extends TeaModel {
    /**
     * <p>The request to create a memory store.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateMemoryStoreRequestBody body;

    /**
     * <p>The client request token.</p>
     * 
     * <strong>example:</strong>
     * <p>memory-store-create-20260909-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateMemoryStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryStoreRequest self = new CreateMemoryStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryStoreRequest setBody(CreateMemoryStoreRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateMemoryStoreRequestBody getBody() {
        return this.body;
    }

    public CreateMemoryStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateMemoryStoreRequestBody extends TeaModel {
        /**
         * <p>The description of the memory store. Maximum of 1,024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to store long-term user preferences</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The custom extraction instructions. Maximum of 4,096 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("extractInstructions")
        public String extractInstructions;

        /**
         * <p>The name of the memory store. The name must be 1 to 64 characters in length and can contain only lowercase letters, digits, and hyphens (-). The name cannot be modified after creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        @NameInMap("memoryStoreName")
        public String memoryStoreName;

        public static CreateMemoryStoreRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryStoreRequestBody self = new CreateMemoryStoreRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateMemoryStoreRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMemoryStoreRequestBody setExtractInstructions(String extractInstructions) {
            this.extractInstructions = extractInstructions;
            return this;
        }
        public String getExtractInstructions() {
            return this.extractInstructions;
        }

        public CreateMemoryStoreRequestBody setMemoryStoreName(String memoryStoreName) {
            this.memoryStoreName = memoryStoreName;
            return this;
        }
        public String getMemoryStoreName() {
            return this.memoryStoreName;
        }

    }

}
