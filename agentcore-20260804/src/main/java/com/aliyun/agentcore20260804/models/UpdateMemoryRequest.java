// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    /**
     * <p>The request to update a memory.</p>
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
         * <p>The updated string key-value metadata. Provide at least one of Text or Metadata. A maximum of 16 keys are allowed. The maximum length is 64 characters for a key and 1,024 characters for a value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The updated memory text. Provide at least one of Text or Metadata. The size cannot exceed 32,000 UTF-8 bytes.</p>
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
