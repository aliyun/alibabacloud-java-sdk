// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowledgeInfo extends TeaModel {
    /**
     * <p>The structured text composed of the entity name and its properties.</p>
     * 
     * <strong>example:</strong>
     * <p>Entity: Amoxicillin capsules</p>
     * <ul>
     * <li>Property[Exact active ingredient]: Amoxicillin</li>
     * <li>Property[Manufactured dosage form]: Oral capsule</li>
     * </ul>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The source link of the entity property content.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://p.example.cn/0387f345/index?struct_id=VdB%2BLV7w7lHHEp">https://p.example.cn/0387f345/index?struct_id=VdB%2BLV7w7lHHEp</a></p>
     */
    @NameInMap("url")
    public String url;

    public static MedicalKnowledgeInfo build(java.util.Map<String, ?> map) throws Exception {
        MedicalKnowledgeInfo self = new MedicalKnowledgeInfo();
        return TeaModel.build(map, self);
    }

    public MedicalKnowledgeInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MedicalKnowledgeInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
