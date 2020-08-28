// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityRuleRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public Long ruleId;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    public static GetQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleRequest self = new GetQualityRuleRequest();
        return TeaModel.build(map, self);
    }

}
