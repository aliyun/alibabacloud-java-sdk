// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Targets")
    public DescribeMetricRuleTargetsResponseBodyTargets targets;

    public static DescribeMetricRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTargetsResponseBody self = new DescribeMetricRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricRuleTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricRuleTargetsResponseBody setTargets(DescribeMetricRuleTargetsResponseBodyTargets targets) {
        this.targets = targets;
        return this;
    }
    public DescribeMetricRuleTargetsResponseBodyTargets getTargets() {
        return this.targets;
    }

    public static class DescribeMetricRuleTargetsResponseBodyTargetsTarget extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        public static DescribeMetricRuleTargetsResponseBodyTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTargetsResponseBodyTargetsTarget self = new DescribeMetricRuleTargetsResponseBodyTargetsTarget();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTargetsResponseBodyTargetsTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeMetricRuleTargetsResponseBodyTargetsTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeMetricRuleTargetsResponseBodyTargetsTarget setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeMetricRuleTargetsResponseBodyTargets extends TeaModel {
        @NameInMap("Target")
        public java.util.List<DescribeMetricRuleTargetsResponseBodyTargetsTarget> target;

        public static DescribeMetricRuleTargetsResponseBodyTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleTargetsResponseBodyTargets self = new DescribeMetricRuleTargetsResponseBodyTargets();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleTargetsResponseBodyTargets setTarget(java.util.List<DescribeMetricRuleTargetsResponseBodyTargetsTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<DescribeMetricRuleTargetsResponseBodyTargetsTarget> getTarget() {
            return this.target;
        }

    }

}
