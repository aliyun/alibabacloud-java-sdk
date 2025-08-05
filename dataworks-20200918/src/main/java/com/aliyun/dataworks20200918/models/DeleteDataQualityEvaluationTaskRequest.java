// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteDataQualityEvaluationTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDataQualityEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityEvaluationTaskRequest self = new DeleteDataQualityEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityEvaluationTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataQualityEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
