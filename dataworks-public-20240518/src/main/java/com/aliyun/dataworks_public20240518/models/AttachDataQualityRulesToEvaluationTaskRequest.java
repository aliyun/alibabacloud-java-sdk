// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AttachDataQualityRulesToEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the associated data quality monitoring task.</p>
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
    public java.util.List<Long> dataQualityRuleIds;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Settings page to obtain the workspace ID.
     * This parameter specifies the DataWorks workspace in which the API operation is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
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
