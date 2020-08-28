// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("Targets")
    @Validation(required = true)
    public java.util.List<PutMetricRuleTargetsRequestTargets> targets;

    public static PutMetricRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsRequest self = new PutMetricRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public static class PutMetricRuleTargetsRequestTargets extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Level")
        public String level;

        public static PutMetricRuleTargetsRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsRequestTargets self = new PutMetricRuleTargetsRequestTargets();
            return TeaModel.build(map, self);
        }

    }

}
