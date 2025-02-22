// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DetachDataQualityRulesFromEvaluationTaskRequest extends TeaModel {
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
    public java.util.List<Long> dataQualityRuleIds;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DetachDataQualityRulesFromEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDataQualityRulesFromEvaluationTaskRequest self = new DetachDataQualityRulesFromEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public DetachDataQualityRulesFromEvaluationTaskRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public DetachDataQualityRulesFromEvaluationTaskRequest setDataQualityRuleIds(java.util.List<Long> dataQualityRuleIds) {
        this.dataQualityRuleIds = dataQualityRuleIds;
        return this;
    }
    public java.util.List<Long> getDataQualityRuleIds() {
        return this.dataQualityRuleIds;
    }

    public DetachDataQualityRulesFromEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
