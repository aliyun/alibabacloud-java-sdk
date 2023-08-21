// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the delete mode. Valid values:</p>
     * <br>
     * <p>*   true: enables the delete mode</p>
     * <p>*   false (default): disables the delete mode</p>
     * <br>
     * <p>> This parameter is valid only when you manually trigger or periodically trigger custom rules to evaluate resources. If you enable the delete mode, the evaluation results that are not updated during the current evaluation are automatically deleted.</p>
     */
    @NameInMap("DeleteMode")
    public Boolean deleteMode;

    /**
     * <p>The evaluation results.</p>
     */
    @NameInMap("Evaluations")
    public String evaluations;

    /**
     * <p>The callback token. When Cloud Config triggers a custom rule to evaluate resources, the token information is sent to Function Compute as an input parameter. The token must be specified when you submit the evaluation results.</p>
     */
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
