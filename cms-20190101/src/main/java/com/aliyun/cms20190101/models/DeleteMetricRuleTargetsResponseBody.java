// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Description** The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The IDs of the resources that failed to be deleted.</p>
     */
    @NameInMap("FailIds")
    public DeleteMetricRuleTargetsResponseBodyFailIds failIds;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteMetricRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleTargetsResponseBody self = new DeleteMetricRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMetricRuleTargetsResponseBody setFailIds(DeleteMetricRuleTargetsResponseBodyFailIds failIds) {
        this.failIds = failIds;
        return this;
    }
    public DeleteMetricRuleTargetsResponseBodyFailIds getFailIds() {
        return this.failIds;
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

    public DeleteMetricRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
        /**
         * <p>The IDs of the resources that failed to be deleted.</p>
         */
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
