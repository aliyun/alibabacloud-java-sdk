// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChunkItem extends TeaModel {
    @NameInMap("chunkContent")
    public String chunkContent;

    /**
     * <strong>example:</strong>
     * <p>b0x7,b1x10</p>
     */
    @NameInMap("chunkId")
    public String chunkId;

    @NameInMap("docElsIds")
    public java.util.List<String> docElsIds;

    /**
     * <strong>example:</strong>
     * <p>b4620821aea92c062d8d19ad793243669cf9ae2b900e6967dee6ee9f3bf5feed</p>
     */
    @NameInMap("docId")
    public String docId;

    @NameInMap("docName")
    public String docName;

    /**
     * <strong>example:</strong>
     * <p>jobs/a4123b3f-9287-4c61-b59d-32e40fcb0a31/document/8b24a2e06669427fb3dc9812374d9d1a.pdf</p>
     */
    @NameInMap("docUrl")
    public String docUrl;

    /**
     * <strong>example:</strong>
     * <p>0.5053711</p>
     */
    @NameInMap("rerankScore")
    public Float rerankScore;

    /**
     * <strong>example:</strong>
     * <p>0.4295678</p>
     */
    @NameInMap("score")
    public Float score;

    /**
     * <strong>example:</strong>
     * <p>0.47252458</p>
     */
    @NameInMap("weightedScore")
    public Float weightedScore;

    public static ChunkItem build(java.util.Map<String, ?> map) throws Exception {
        ChunkItem self = new ChunkItem();
        return TeaModel.build(map, self);
    }

    public ChunkItem setChunkContent(String chunkContent) {
        this.chunkContent = chunkContent;
        return this;
    }
    public String getChunkContent() {
        return this.chunkContent;
    }

    public ChunkItem setChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }
    public String getChunkId() {
        return this.chunkId;
    }

    public ChunkItem setDocElsIds(java.util.List<String> docElsIds) {
        this.docElsIds = docElsIds;
        return this;
    }
    public java.util.List<String> getDocElsIds() {
        return this.docElsIds;
    }

    public ChunkItem setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public ChunkItem setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ChunkItem setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public ChunkItem setRerankScore(Float rerankScore) {
        this.rerankScore = rerankScore;
        return this;
    }
    public Float getRerankScore() {
        return this.rerankScore;
    }

    public ChunkItem setScore(Float score) {
        this.score = score;
        return this;
    }
    public Float getScore() {
        return this.score;
    }

    public ChunkItem setWeightedScore(Float weightedScore) {
        this.weightedScore = weightedScore;
        return this;
    }
    public Float getWeightedScore() {
        return this.weightedScore;
    }

}
