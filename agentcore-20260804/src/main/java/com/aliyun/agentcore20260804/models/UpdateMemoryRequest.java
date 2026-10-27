// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    /**
     * <p>The update memory request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateMemoryRequestBody body;

    public static UpdateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRequest self = new UpdateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRequest setBody(UpdateMemoryRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryRequestBody getBody() {
        return this.body;
    }

    public static class UpdateMemoryRequestBody extends TeaModel {
        /**
         * <p>The updated string key-value metadata. You must provide at least one of Metadata or Text. A maximum of 16 keys are allowed. The maximum length of a key is 64 characters, and the maximum length of a value is 1,024 characters.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The updated memory text. You must provide at least one of Text or Metadata. The maximum size is 32,000 UTF-8 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>The user enjoys hiking on weekends</p>
         */
        @NameInMap("text")
        public String text;

        public static UpdateMemoryRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryRequestBody self = new UpdateMemoryRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryRequestBody setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public UpdateMemoryRequestBody setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
