// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutEvaluationsRequest extends TeaModel {
    /**
     * <p>The compliance evaluation results.</p>
     */
    @NameInMap("Evaluations")
    public String evaluations;

    /**
     * <p>The token used to return the response.</p>
     */
    @NameInMap("ResultToken")
    public String resultToken;

    public static PutEvaluationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsRequest self = new PutEvaluationsRequest();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsRequest setEvaluations(String evaluations) {
        this.evaluations = evaluations;
        return this;
    }
    public String getEvaluations() {
        return this.evaluations;
    }

    public PutEvaluationsRequest setResultToken(String resultToken) {
        this.resultToken = resultToken;
        return this;
    }
    public String getResultToken() {
        return this.resultToken;
    }

}
