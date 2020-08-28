// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailedListResult")
    @Validation(required = true)
    public PutResourceMetricRulesResponseFailedListResult failedListResult;

    public static PutResourceMetricRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesResponse self = new PutResourceMetricRulesResponse();
        return TeaModel.build(map, self);
    }

    public static class PutResourceMetricRulesResponseFailedListResultTargetResult extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static PutResourceMetricRulesResponseFailedListResultTargetResult build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseFailedListResultTargetResult self = new PutResourceMetricRulesResponseFailedListResultTargetResult();
            return TeaModel.build(map, self);
        }

    }

    public static class PutResourceMetricRulesResponseFailedListResultTarget extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("Result")
        @Validation(required = true)
        public PutResourceMetricRulesResponseFailedListResultTargetResult result;

        public static PutResourceMetricRulesResponseFailedListResultTarget build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseFailedListResultTarget self = new PutResourceMetricRulesResponseFailedListResultTarget();
            return TeaModel.build(map, self);
        }

    }

    public static class PutResourceMetricRulesResponseFailedListResult extends TeaModel {
        @NameInMap("Target")
        @Validation(required = true)
        public java.util.List<PutResourceMetricRulesResponseFailedListResultTarget> target;

        public static PutResourceMetricRulesResponseFailedListResult build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseFailedListResult self = new PutResourceMetricRulesResponseFailedListResult();
            return TeaModel.build(map, self);
        }

    }

}
