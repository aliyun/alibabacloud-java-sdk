// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AttachDataQualityRulesToEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the data quality monitoring task that is associated with the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200001</p>
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
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID. You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static AttachDataQualityRulesToEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDataQualityRulesToEvaluationTaskRequest self = new AttachDataQualityRulesToEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public AttachDataQualityRulesToEvaluationTaskRequest setDataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
        this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
        return this;
    }
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    public AttachDataQualityRulesToEvaluationTaskRequest setDataQualityRuleIds(java.util.List<Long> dataQualityRuleIds) {
        this.dataQualityRuleIds = dataQualityRuleIds;
        return this;
    }
    public java.util.List<Long> getDataQualityRuleIds() {
        return this.dataQualityRuleIds;
    }

    public AttachDataQualityRulesToEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
