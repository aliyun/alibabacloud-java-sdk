// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IndexKey extends TeaModel {
    /**
     * <p>Specifies whether Chinese characters are included.</p>
     * <ul>
     * <li>true: Chinese characters are included.</li>
     * <li>false: Chinese characters are not included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("embedding")
    public String embedding;

    /**
     * <p>json key</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;message&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;chn&quot;:true}}</p>
     */
    @NameInMap("jsonKeys")
    public java.util.Map<String, IndexJsonKey> jsonKeys;

    /**
     * <p>The field type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
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
