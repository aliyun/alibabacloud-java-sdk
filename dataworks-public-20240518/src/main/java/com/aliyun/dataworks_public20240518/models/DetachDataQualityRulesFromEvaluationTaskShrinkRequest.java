// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DetachDataQualityRulesFromEvaluationTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataQualityRuleIds")
    public String dataQualityRuleIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DetachDataQualityRulesFromEvaluationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDataQualityRulesFromEvaluationTaskShrinkRequest self = new DetachDataQualityRulesFromEvaluationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachDataQualityRulesFromEvaluationTaskShrinkRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public DetachDataQualityRulesFromEvaluationTaskShrinkRequest setDataQualityRuleIdsShrink(String dataQualityRuleIdsShrink) {
        this.dataQualityRuleIdsShrink = dataQualityRuleIdsShrink;
        return this;
    }
    public String getDataQualityRuleIdsShrink() {
        return this.dataQualityRuleIdsShrink;
    }

    public DetachDataQualityRulesFromEvaluationTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
