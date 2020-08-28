// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Resources")
    @Validation(required = true)
    public CreateGroupMetricRulesResponseResources resources;

    public static CreateGroupMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesResponse self = new CreateGroupMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateGroupMetricRulesResponseResourcesAlertResult extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static CreateGroupMetricRulesResponseResourcesAlertResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesResponseResourcesAlertResult self = new CreateGroupMetricRulesResponseResourcesAlertResult();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateGroupMetricRulesResponseResources extends TeaModel {
        @NameInMap("AlertResult")
        @Validation(required = true)
        public java.util.List<CreateGroupMetricRulesResponseResourcesAlertResult> alertResult;

        public static CreateGroupMetricRulesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesResponseResources self = new CreateGroupMetricRulesResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
