// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityRuleRequest extends TeaModel {
    /**
     * <p>The name of the database engine or data source.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRuleRequest self = new DeleteQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRuleRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteQualityRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
