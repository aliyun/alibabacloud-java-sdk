// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutEvaluationsRequest extends TeaModel {
    @NameInMap("ResultToken")
    @Validation(required = true)
    public String resultToken;

    @NameInMap("Evaluations")
    public String evaluations;

    public static PutEvaluationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsRequest self = new PutEvaluationsRequest();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsRequest setResultToken(String resultToken) {
        this.resultToken = resultToken;
        return this;
    }
    public String getResultToken() {
        return this.resultToken;
    }

    public PutEvaluationsRequest setEvaluations(String evaluations) {
        this.evaluations = evaluations;
        return this;
    }
    public String getEvaluations() {
        return this.evaluations;
    }

}
