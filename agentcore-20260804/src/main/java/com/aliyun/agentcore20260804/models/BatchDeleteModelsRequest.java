// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchDeleteModelsRequest extends TeaModel {
    @NameInMap("body")
    public BatchDeleteModelsRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static BatchDeleteModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelsRequest self = new BatchDeleteModelsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelsRequest setBody(BatchDeleteModelsRequestBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteModelsRequestBody getBody() {
        return this.body;
    }

    public BatchDeleteModelsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class BatchDeleteModelsRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("modelIds")
        public java.util.List<String> modelIds;

        public static BatchDeleteModelsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteModelsRequestBody self = new BatchDeleteModelsRequestBody();
            return TeaModel.build(map, self);
        }

        public BatchDeleteModelsRequestBody setModelIds(java.util.List<String> modelIds) {
            this.modelIds = modelIds;
            return this;
        }
        public java.util.List<String> getModelIds() {
            return this.modelIds;
        }

    }

}
