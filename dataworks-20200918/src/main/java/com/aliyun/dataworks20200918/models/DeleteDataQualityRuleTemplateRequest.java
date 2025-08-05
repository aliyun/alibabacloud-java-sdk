// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteDataQualityRuleTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDataQualityRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityRuleTemplateRequest self = new DeleteDataQualityRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityRuleTemplateRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDataQualityRuleTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
