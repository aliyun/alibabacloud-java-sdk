// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("FailIds")
    public DeleteMetricRuleTargetsResponseBodyFailIds failIds;

    public static DeleteMetricRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsResponseBody self = new DeleteMetricRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMetricRuleTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetricRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMetricRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteMetricRuleTargetsResponseBody setFailIds(DeleteMetricRuleTargetsResponseBodyFailIds failIds) {
        this.failIds = failIds;
        return this;
    }
    public DeleteMetricRuleTargetsResponseBodyFailIds getFailIds() {
        return this.failIds;
    }

    public static class DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds extends TeaModel {
        @NameInMap("TargetId")
        public java.util.List<String> targetId;

        public static DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds self = new DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds();
            return TeaModel.build(map, self);
        }

        public DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds setTargetId(java.util.List<String> targetId) {
            this.targetId = targetId;
            return this;
        }
        public java.util.List<String> getTargetId() {
            return this.targetId;
        }

    }

    public static class DeleteMetricRuleTargetsResponseBodyFailIds extends TeaModel {
        @NameInMap("TargetIds")
        public DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds targetIds;

        public static DeleteMetricRuleTargetsResponseBodyFailIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMetricRuleTargetsResponseBodyFailIds self = new DeleteMetricRuleTargetsResponseBodyFailIds();
            return TeaModel.build(map, self);
        }

        public DeleteMetricRuleTargetsResponseBodyFailIds setTargetIds(DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds targetIds) {
            this.targetIds = targetIds;
            return this;
        }
        public DeleteMetricRuleTargetsResponseBodyFailIdsTargetIds getTargetIds() {
            return this.targetIds;
        }

    }

}
