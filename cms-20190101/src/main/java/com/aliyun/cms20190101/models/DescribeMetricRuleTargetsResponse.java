// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Targets")
    @Validation(required = true)
    public DescribeMetricRuleTargetsResponseTargets targets;

    public static DescribeMetricRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTargetsResponse self = new DescribeMetricRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMetricRuleTargetsResponseTargetsTarget extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        public static DescribeMetricRuleTargetsResponseTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTargetsResponseTargetsTarget self = new DescribeMetricRuleTargetsResponseTargetsTarget();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMetricRuleTargetsResponseTargets extends TeaModel {
        @NameInMap("Target")
        @Validation(required = true)
        public java.util.List<DescribeMetricRuleTargetsResponseTargetsTarget> target;

        public static DescribeMetricRuleTargetsResponseTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTargetsResponseTargets self = new DescribeMetricRuleTargetsResponseTargets();
            return TeaModel.build(map, self);
        }

    }

}
