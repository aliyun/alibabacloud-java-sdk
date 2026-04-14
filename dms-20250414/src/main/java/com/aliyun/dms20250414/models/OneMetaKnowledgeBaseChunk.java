// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaKnowledgeBaseChunk extends TeaModel {
    @NameInMap("ChunkMtime")
    public String chunkMtime;

    @NameInMap("ChunkTitle")
    public String chunkTitle;

    @NameInMap("Content")
    public String content;

    @NameInMap("DocName")
    public String docName;

    @NameInMap("Id")
    public String id;

    public static OneMetaKnowledgeBaseChunk build(java.util.Map<String, ?> map) throws Exception {
        OneMetaKnowledgeBaseChunk self = new OneMetaKnowledgeBaseChunk();
        return TeaModel.build(map, self);
    }

    public OneMetaKnowledgeBaseChunk setChunkMtime(String chunkMtime) {
        this.chunkMtime = chunkMtime;
        return this;
    }
    public String getChunkMtime() {
        return this.chunkMtime;
    }

    public OneMetaKnowledgeBaseChunk setChunkTitle(String chunkTitle) {
        this.chunkTitle = chunkTitle;
        return this;
    }
    public String getChunkTitle() {
        return this.chunkTitle;
    }

    public OneMetaKnowledgeBaseChunk setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public OneMetaKnowledgeBaseChunk setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public OneMetaKnowledgeBaseChunk setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
