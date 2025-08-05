// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteDataQualityRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDataQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityRuleRequest self = new DeleteDataQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
