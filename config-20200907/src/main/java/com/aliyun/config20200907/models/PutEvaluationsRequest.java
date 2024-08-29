// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the delete mode. Valid values:</p>
     * <ul>
     * <li>true: enables the delete mode</li>
     * <li>false (default): disables the delete mode</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when you manually trigger or periodically trigger custom rules to evaluate resources. If you enable the delete mode, the evaluation results that are not updated during the current evaluation are automatically deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteMode")
    public Boolean deleteMode;

    /**
     * <p>The evaluation results.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;accountId&quot;:120886317861****,&quot;annotation&quot;:&quot;The flow log is not enabled.&quot;,&quot;complianceResourceId&quot;:&quot;flowlog-o6wdfo1yvgo4i8****&quot;,&quot;complianceResourceType&quot;:&quot;ACS::CEN::Flowlog&quot;,&quot;complianceRegionId&quot;:&quot;cn-shanghai&quot;,&quot;complianceType&quot;:&quot;NON_COMPLIANT&quot;,&quot;orderingTimestamp&quot;:1588907220408}]</p>
     */
    @NameInMap("Evaluations")
    public String evaluations;

    /**
     * <p>The callback token. When Cloud Config triggers a custom rule to evaluate resources, the token information is sent to Function Compute as an input parameter. The token must be specified when you submit the evaluation results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>=lAUbfkWp7GL9AFoQEIStinqBMc4FC8sHvip/1F1npkWUDNS2GEm6xwL6Zl/fSr0bbkWY+aiCLjTJxnp4H/yp/8p/Q8VCAtqG5uhRii4sfnYRnTPnE****</p>
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
