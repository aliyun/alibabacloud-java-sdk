// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerInput extends TeaModel {
    @NameInMap("query")
    public String query;

    public static MedicalAnswerInput build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerInput self = new MedicalAnswerInput();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerInput setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
