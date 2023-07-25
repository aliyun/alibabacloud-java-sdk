// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsRequest extends TeaModel {
    @NameInMap("DeleteMode")
    public Boolean deleteMode;

    @NameInMap("Evaluations")
    public String evaluations;

    @NameInMap("ResultToken")
    public String resultToken;

    public static PutEvaluationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsRequest self = new PutEvaluationsRequest();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsRequest setDeleteMode(Boolean deleteMode) {
        this.deleteMode = deleteMode;
        return this;
    }
    public Boolean getDeleteMode() {
        return this.deleteMode;
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
