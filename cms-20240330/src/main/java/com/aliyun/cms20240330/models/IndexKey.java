// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IndexKey extends TeaModel {
    @NameInMap("chn")
    public Boolean chn;

    @NameInMap("embedding")
    public String embedding;

    @NameInMap("jsonKeys")
    public java.util.Map<String, IndexJsonKey> jsonKeys;

    @NameInMap("type")
    public String type;

    public static IndexKey build(java.util.Map<String, ?> map) throws Exception {
        IndexKey self = new IndexKey();
        return TeaModel.build(map, self);
    }

    public IndexKey setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public IndexKey setEmbedding(String embedding) {
        this.embedding = embedding;
        return this;
    }
    public String getEmbedding() {
        return this.embedding;
    }

    public IndexKey setJsonKeys(java.util.Map<String, IndexJsonKey> jsonKeys) {
        this.jsonKeys = jsonKeys;
        return this;
    }
    public java.util.Map<String, IndexJsonKey> getJsonKeys() {
        return this.jsonKeys;
    }

    public IndexKey setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
