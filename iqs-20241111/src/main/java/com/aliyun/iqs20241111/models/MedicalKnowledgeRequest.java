// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowledgeRequest extends TeaModel {
    @NameInMap("body")
    public MedicalKnowInput body;

    public static MedicalKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        MedicalKnowledgeRequest self = new MedicalKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public MedicalKnowledgeRequest setBody(MedicalKnowInput body) {
        this.body = body;
        return this;
    }
    public MedicalKnowInput getBody() {
        return this.body;
    }

}
