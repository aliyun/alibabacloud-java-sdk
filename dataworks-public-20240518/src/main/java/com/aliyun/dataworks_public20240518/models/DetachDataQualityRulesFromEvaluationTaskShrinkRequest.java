// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DetachDataQualityRulesFromEvaluationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the data quality monitoring task that is associated with the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>The IDs of the monitoring rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataQualityRuleIds")
    public String dataQualityRuleIdsShrink;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
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
