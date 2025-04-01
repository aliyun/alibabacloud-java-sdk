// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateDocumentChunkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("chunks")
    public java.util.List<UpdateDocumentChunkRequestChunks> chunks;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sjdgdsfg</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    public static UpdateDocumentChunkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentChunkRequest self = new UpdateDocumentChunkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentChunkRequest setChunks(java.util.List<UpdateDocumentChunkRequestChunks> chunks) {
        this.chunks = chunks;
        return this;
    }
    public java.util.List<UpdateDocumentChunkRequestChunks> getChunks() {
        return this.chunks;
    }

    public UpdateDocumentChunkRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public static class UpdateDocumentChunkRequestChunks extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1987834755763847</p>
         */
        @NameInMap("chunkId")
        public String chunkId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("chunkText")
        public String chunkText;

        public static UpdateDocumentChunkRequestChunks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDocumentChunkRequestChunks self = new UpdateDocumentChunkRequestChunks();
            return TeaModel.build(map, self);
        }

        public UpdateDocumentChunkRequestChunks setChunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }
        public String getChunkId() {
            return this.chunkId;
        }

        public UpdateDocumentChunkRequestChunks setChunkText(String chunkText) {
            this.chunkText = chunkText;
            return this;
        }
        public String getChunkText() {
            return this.chunkText;
        }

    }

}
