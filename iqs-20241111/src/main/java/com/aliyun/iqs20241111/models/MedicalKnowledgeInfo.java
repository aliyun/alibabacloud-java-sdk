// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowledgeInfo extends TeaModel {
    @NameInMap("content")
    public String content;

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
