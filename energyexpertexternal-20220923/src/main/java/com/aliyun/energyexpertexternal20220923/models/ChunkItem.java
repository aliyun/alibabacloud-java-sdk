// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChunkItem extends TeaModel {
    @NameInMap("chunkContent")
    public String chunkContent;

    @NameInMap("chunkId")
    public String chunkId;

    @NameInMap("docElsIds")
    public java.util.List<String> docElsIds;

    @NameInMap("docId")
    public String docId;

    @NameInMap("docName")
    public String docName;

    @NameInMap("docUrl")
    public String docUrl;

    @NameInMap("rerankScore")
    public Float rerankScore;

    @NameInMap("score")
    public Float score;

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
