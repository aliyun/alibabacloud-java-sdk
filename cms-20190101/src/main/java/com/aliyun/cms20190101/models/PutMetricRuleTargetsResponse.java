// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponse extends TeaModel {
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

    @NameInMap("FailData")
    @Validation(required = true)
    public PutMetricRuleTargetsResponseFailData failData;

    public static PutMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsResponse self = new PutMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public static class PutMetricRuleTargetsResponseFailDataTargetsTarget extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        public static PutMetricRuleTargetsResponseFailDataTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseFailDataTargetsTarget self = new PutMetricRuleTargetsResponseFailDataTargetsTarget();
            return TeaModel.build(map, self);
        }

    }

    public static class PutMetricRuleTargetsResponseFailDataTargets extends TeaModel {
        @NameInMap("Target")
        @Validation(required = true)
        public java.util.List<PutMetricRuleTargetsResponseFailDataTargetsTarget> target;

        public static PutMetricRuleTargetsResponseFailDataTargets build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseFailDataTargets self = new PutMetricRuleTargetsResponseFailDataTargets();
            return TeaModel.build(map, self);
        }

    }

    public static class PutMetricRuleTargetsResponseFailData extends TeaModel {
        @NameInMap("Targets")
        @Validation(required = true)
        public PutMetricRuleTargetsResponseFailDataTargets targets;

        public static PutMetricRuleTargetsResponseFailData build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseFailData self = new PutMetricRuleTargetsResponseFailData();
            return TeaModel.build(map, self);
        }

    }

}
