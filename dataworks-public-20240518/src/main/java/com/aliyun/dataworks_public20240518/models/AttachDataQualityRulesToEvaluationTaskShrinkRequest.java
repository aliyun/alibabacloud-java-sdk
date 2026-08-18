// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AttachDataQualityRulesToEvaluationTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the associated quality check task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200001</p>
     */
    @NameInMap("DataQualityEvaluationTaskId")
    public Long dataQualityEvaluationTaskId;

    /**
     * <p>The list of data quality rule IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataQualityRuleIds")
    public String dataQualityRuleIdsShrink;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static AttachDataQualityRulesToEvaluationTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDataQualityRulesToEvaluationTaskShrinkRequest self = new AttachDataQualityRulesToEvaluationTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachDataQualityRulesToEvaluationTaskShrinkRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public AttachDataQualityRulesToEvaluationTaskShrinkRequest setDataQualityRuleIdsShrink(String dataQualityRuleIdsShrink) {
        this.dataQualityRuleIdsShrink = dataQualityRuleIdsShrink;
        return this;
    }
    public String getDataQualityRuleIdsShrink() {
        return this.dataQualityRuleIdsShrink;
    }

    public AttachDataQualityRulesToEvaluationTaskShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
