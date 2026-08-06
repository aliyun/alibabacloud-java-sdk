// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class GetKnowledgeBasePreSignedUrlRequest extends TeaModel {
    @NameInMap("Documents")
    public java.util.List<GetKnowledgeBasePreSignedUrlRequestDocuments> documents;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpiresIn")
    public Integer expiresIn;

    /**
     * <strong>example:</strong>
     * <p>kb-3bd02617e9be335f</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    public static GetKnowledgeBasePreSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBasePreSignedUrlRequest self = new GetKnowledgeBasePreSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBasePreSignedUrlRequest setDocuments(java.util.List<GetKnowledgeBasePreSignedUrlRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<GetKnowledgeBasePreSignedUrlRequestDocuments> getDocuments() {
        return this.documents;
    }

    public GetKnowledgeBasePreSignedUrlRequest setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    public GetKnowledgeBasePreSignedUrlRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public static class GetKnowledgeBasePreSignedUrlRequestDocuments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CHANGELOG.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>本地上传时为预签名上传使用的批次相对路径；不同 ImportType 下含义由导入类型定义。</p>
         * 
         * <strong>example:</strong>
         * <p>contract-2026.md</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        public static GetKnowledgeBasePreSignedUrlRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBasePreSignedUrlRequestDocuments self = new GetKnowledgeBasePreSignedUrlRequestDocuments();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBasePreSignedUrlRequestDocuments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeBasePreSignedUrlRequestDocuments setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetKnowledgeBasePreSignedUrlRequestDocuments setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
