// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class KnowledgeBaseSearchChunk extends TeaModel {
    /**
     * <p>The sequence number of the chunk within the document.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ChunkSeq")
    public Integer chunkSeq;

    /**
     * <p>The body content of the hit chunk.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBridge supports routing events to multiple target services</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the document to which the hit chunk belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>doc-bp1xxxxxxxxxxxx</p>
     */
    @NameInMap("DocumentId")
    public String documentId;

    /**
     * <p>The file name of the document to which the hit chunk belongs. This value has the same source as the FileName returned by GetDocument and can be used to render the reference source.</p>
     * 
     * <strong>example:</strong>
     * <p>product-handbook.pdf</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The retrieval relevance score. A higher score indicates higher relevance.</p>
     * 
     * <strong>example:</strong>
     * <p>0.92</p>
     */
    @NameInMap("Score")
    public Double score;

    /**
     * <p>The score details for each stage. Score fields that are not involved in the calculation are not returned.</p>
     */
    @NameInMap("Scores")
    public KnowledgeBaseSearchChunkScores scores;

    /**
     * <p>The location of the chunk in the original document. p.N indicates page N (PDF). s.N indicates slide N (PPT/PPTX).</p>
     * 
     * <strong>example:</strong>
     * <p>p.3</p>
     */
    @NameInMap("SourceLocation")
    public String sourceLocation;

    /**
     * <p>The title path to which the chunk belongs, such as Chapter 1&gt;1.1 Overview.</p>
     * 
     * <strong>example:</strong>
     * <p>Installation Guide&gt;Prerequisites</p>
     */
    @NameInMap("TitlePath")
    public String titlePath;

    public static KnowledgeBaseSearchChunk build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseSearchChunk self = new KnowledgeBaseSearchChunk();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseSearchChunk setChunkSeq(Integer chunkSeq) {
        this.chunkSeq = chunkSeq;
        return this;
    }
    public Integer getChunkSeq() {
        return this.chunkSeq;
    }

    public KnowledgeBaseSearchChunk setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public KnowledgeBaseSearchChunk setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

    public KnowledgeBaseSearchChunk setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public KnowledgeBaseSearchChunk setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public KnowledgeBaseSearchChunk setScores(KnowledgeBaseSearchChunkScores scores) {
        this.scores = scores;
        return this;
    }
    public KnowledgeBaseSearchChunkScores getScores() {
        return this.scores;
    }

    public KnowledgeBaseSearchChunk setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    public KnowledgeBaseSearchChunk setTitlePath(String titlePath) {
        this.titlePath = titlePath;
        return this;
    }
    public String getTitlePath() {
        return this.titlePath;
    }

    public static class KnowledgeBaseSearchChunkScores extends TeaModel {
        /**
         * <p>The score after hybrid search fusion (reciprocal rank fusion or weighted normalization, depending on the active fusion algorithm). Value range: [0, 1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.78</p>
         */
        @NameInMap("Fusion")
        public Double fusion;

        /**
         * <p>The normalized score of keyword (full-text) search. Value range: [0, 1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.62</p>
         */
        @NameInMap("Keyword")
        public Double keyword;

        /**
         * <p>The score assigned by the rerank model. Value range: [0, 1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.91</p>
         */
        @NameInMap("Rerank")
        public Double rerank;

        /**
         * <p>The similarity score of vector retrieval. Value range: [0, 1].</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("Vector")
        public Double vector;

        public static KnowledgeBaseSearchChunkScores build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseSearchChunkScores self = new KnowledgeBaseSearchChunkScores();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseSearchChunkScores setFusion(Double fusion) {
            this.fusion = fusion;
            return this;
        }
        public Double getFusion() {
            return this.fusion;
        }

        public KnowledgeBaseSearchChunkScores setKeyword(Double keyword) {
            this.keyword = keyword;
            return this;
        }
        public Double getKeyword() {
            return this.keyword;
        }

        public KnowledgeBaseSearchChunkScores setRerank(Double rerank) {
            this.rerank = rerank;
            return this;
        }
        public Double getRerank() {
            return this.rerank;
        }

        public KnowledgeBaseSearchChunkScores setVector(Double vector) {
            this.vector = vector;
            return this;
        }
        public Double getVector() {
            return this.vector;
        }

    }

}
