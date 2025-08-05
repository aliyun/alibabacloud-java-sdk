// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetQualityRuleRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleRequest self = new GetQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetQualityRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetQualityRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
