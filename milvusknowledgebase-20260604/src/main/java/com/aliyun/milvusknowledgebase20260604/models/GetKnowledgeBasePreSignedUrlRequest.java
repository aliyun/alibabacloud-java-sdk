// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvusknowledgebase20260604.models;

import com.aliyun.tea.*;

public class GetKnowledgeBasePreSignedUrlRequest extends TeaModel {
    /**
     * <p>The list of files to upload. You can specify 1 to 100 files.</p>
     */
    @NameInMap("Documents")
    public java.util.List<GetKnowledgeBasePreSignedUrlRequestDocuments> documents;

    /**
     * <p>The validity period of the pre-signed URL in seconds. Default value: <code>3600</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpiresIn")
    public Integer expiresIn;

    /**
     * <p>The knowledge base ID. Either this parameter or datasetId must be specified. This parameter takes priority.</p>
     * 
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
         * <p>The display name of the file. If not specified, the file name from Path is used.</p>
         * 
         * <strong>example:</strong>
         * <p>CHANGELOG.md</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file name or relative path for local upload scenarios. The value cannot start with <code>direct_upload/</code> or <code>uploaded/</code>, cannot contain empty segments, <code>.</code>, or <code>..</code>, and must be 1024 bytes or less.</p>
         * 
         * <strong>example:</strong>
         * <p>contract-2026.md</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The file size in bytes.</p>
         * 
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
