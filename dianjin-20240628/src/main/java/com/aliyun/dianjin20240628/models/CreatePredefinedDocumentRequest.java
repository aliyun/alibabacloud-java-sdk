// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePredefinedDocumentRequest extends TeaModel {
    @NameInMap("chunks")
    public java.util.List<CreatePredefinedDocumentRequestChunks> chunks;

    /**
     * <strong>example:</strong>
     * <p>a1b2c3</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;a&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>测试文档</p>
     */
    @NameInMap("title")
    public String title;

    public static CreatePredefinedDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePredefinedDocumentRequest self = new CreatePredefinedDocumentRequest();
        return TeaModel.build(map, self);
    }

    public CreatePredefinedDocumentRequest setChunks(java.util.List<CreatePredefinedDocumentRequestChunks> chunks) {
        this.chunks = chunks;
        return this;
    }
    public java.util.List<CreatePredefinedDocumentRequestChunks> getChunks() {
        return this.chunks;
    }

    public CreatePredefinedDocumentRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public CreatePredefinedDocumentRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreatePredefinedDocumentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreatePredefinedDocumentRequestChunks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;1&quot;}</p>
         */
        @NameInMap("chunkMeta")
        public java.util.Map<String, ?> chunkMeta;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("chunkOrder")
        public Integer chunkOrder;

        /**
         * <strong>example:</strong>
         * <p>这是一段测试文本</p>
         */
        @NameInMap("chunkText")
        public String chunkText;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("chunkType")
        public String chunkType;

        public static CreatePredefinedDocumentRequestChunks build(java.util.Map<String, ?> map) throws Exception {
            CreatePredefinedDocumentRequestChunks self = new CreatePredefinedDocumentRequestChunks();
            return TeaModel.build(map, self);
        }

        public CreatePredefinedDocumentRequestChunks setChunkMeta(java.util.Map<String, ?> chunkMeta) {
            this.chunkMeta = chunkMeta;
            return this;
        }
        public java.util.Map<String, ?> getChunkMeta() {
            return this.chunkMeta;
        }

        public CreatePredefinedDocumentRequestChunks setChunkOrder(Integer chunkOrder) {
            this.chunkOrder = chunkOrder;
            return this;
        }
        public Integer getChunkOrder() {
            return this.chunkOrder;
        }

        public CreatePredefinedDocumentRequestChunks setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

        public CreatePredefinedDocumentRequestChunks setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

    }

}
