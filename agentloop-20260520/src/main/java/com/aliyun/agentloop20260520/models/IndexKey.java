// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class IndexKey extends TeaModel {
    /**
     * <p>Specifies whether Chinese is included. This parameter is required only when the <strong>type</strong> parameter is set to <strong>text</strong>. Valid values:</p>
     * <ul>
     * <li>true: Chinese is included.</li>
     * <li>false: Chinese is not included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The field embedding type.</p>
     * 
     * <strong>example:</strong>
     * <p>agentloop-embedding-v4</p>
     */
    @NameInMap("embedding")
    public String embedding;

    /**
     * <p>The JSON subfields. This parameter takes effect only when type is set to json.</p>
     */
    @NameInMap("jsonKeys")
    public java.util.Map<String, IndexJsonKey> jsonKeys;

    /**
     * <p>The type.</p>
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

    public IndexKey setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
