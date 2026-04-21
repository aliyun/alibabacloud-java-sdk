// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerRequest extends TeaModel {
    @NameInMap("body")
    public MedicalAnswerInput body;

    public static MedicalAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerRequest self = new MedicalAnswerRequest();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerRequest setBody(MedicalAnswerInput body) {
        this.body = body;
        return this;
    }
    public MedicalAnswerInput getBody() {
        return this.body;
    }

}
