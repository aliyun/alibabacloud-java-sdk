// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateTextEmbeddingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTextEmbeddingsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTextEmbeddingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTextEmbeddingsResponseBody self = new CreateTextEmbeddingsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTextEmbeddingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTextEmbeddingsResponseBody setData(CreateTextEmbeddingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTextEmbeddingsResponseBodyData getData() {
        return this.data;
    }

    public CreateTextEmbeddingsResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTextEmbeddingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTextEmbeddingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTextEmbeddingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTextEmbeddingsResponseBodyDataEmbeddings extends TeaModel {
        @NameInMap("Embedding")
        public java.util.List<Double> embedding;

        @NameInMap("TextIndex")
        public Integer textIndex;

        public static CreateTextEmbeddingsResponseBodyDataEmbeddings build(java.util.Map<String, ?> map) throws Exception {
            CreateTextEmbeddingsResponseBodyDataEmbeddings self = new CreateTextEmbeddingsResponseBodyDataEmbeddings();
            return TeaModel.build(map, self);
        }

        public CreateTextEmbeddingsResponseBodyDataEmbeddings setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

        public CreateTextEmbeddingsResponseBodyDataEmbeddings setTextIndex(Integer textIndex) {
            this.textIndex = textIndex;
            return this;
        }
        public Integer getTextIndex() {
            return this.textIndex;
        }

    }

    public static class CreateTextEmbeddingsResponseBodyData extends TeaModel {
        @NameInMap("Embeddings")
        public java.util.List<CreateTextEmbeddingsResponseBodyDataEmbeddings> embeddings;

        public static CreateTextEmbeddingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTextEmbeddingsResponseBodyData self = new CreateTextEmbeddingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTextEmbeddingsResponseBodyData setEmbeddings(java.util.List<CreateTextEmbeddingsResponseBodyDataEmbeddings> embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public java.util.List<CreateTextEmbeddingsResponseBodyDataEmbeddings> getEmbeddings() {
            return this.embeddings;
        }

    }

}
