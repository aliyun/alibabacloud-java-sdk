// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("FailData")
    public PutMetricRuleTargetsResponseBodyFailData failData;

    public static PutMetricRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMetricRuleTargetsResponseBody self = new PutMetricRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMetricRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutMetricRuleTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutMetricRuleTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutMetricRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PutMetricRuleTargetsResponseBody setFailData(PutMetricRuleTargetsResponseBodyFailData failData) {
        this.failData = failData;
        return this;
    }
    public PutMetricRuleTargetsResponseBodyFailData getFailData() {
        return this.failData;
    }

    public static class PutMetricRuleTargetsResponseBodyFailDataTargetsTarget extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Arn")
        public String arn;

        @NameInMap("Level")
        public String level;

        public static PutMetricRuleTargetsResponseBodyFailDataTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailDataTargetsTarget self = new PutMetricRuleTargetsResponseBodyFailDataTargetsTarget();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutMetricRuleTargetsResponseBodyFailDataTargets extends TeaModel {
        @NameInMap("Target")
        public java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> target;

        public static PutMetricRuleTargetsResponseBodyFailDataTargets build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailDataTargets self = new PutMetricRuleTargetsResponseBodyFailDataTargets();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargets setTarget(java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<PutMetricRuleTargetsResponseBodyFailDataTargetsTarget> getTarget() {
            return this.target;
        }

    }

    public static class PutMetricRuleTargetsResponseBodyFailData extends TeaModel {
        @NameInMap("Targets")
        public PutMetricRuleTargetsResponseBodyFailDataTargets targets;

        public static PutMetricRuleTargetsResponseBodyFailData build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailData self = new PutMetricRuleTargetsResponseBodyFailData();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailData setTargets(PutMetricRuleTargetsResponseBodyFailDataTargets targets) {
            this.targets = targets;
            return this;
        }
        public PutMetricRuleTargetsResponseBodyFailDataTargets getTargets() {
            return this.targets;
        }

    }

}
