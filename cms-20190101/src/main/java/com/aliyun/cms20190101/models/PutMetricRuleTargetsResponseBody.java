// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of resources that failed to be created or modified.</p>
     */
    @NameInMap("FailData")
    public PutMetricRuleTargetsResponseBodyFailData failData;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public PutMetricRuleTargetsResponseBody setFailData(PutMetricRuleTargetsResponseBodyFailData failData) {
        this.failData = failData;
        return this;
    }
    public PutMetricRuleTargetsResponseBodyFailData getFailData() {
        return this.failData;
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

    public static class PutMetricRuleTargetsResponseBodyFailDataTargetsTarget extends TeaModel {
        /**
         * <p>The ARN of the resource.</p>
         * <br>
         * <p>Format: `acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message`. Example: `acs:mns:cn-hangzhou:120886317861****:/queues/test123/message`. Fields:</p>
         * <br>
         * <p>*   {Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</p>
         * <p>*   {userId}: the ID of the Alibaba Cloud account.</p>
         * <p>*   {regionId}: the region ID of the message queue or topic.</p>
         * <p>*   {Resource type}`: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.`</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the resource for which alerts are triggered.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <br>
         * <p>*   INFO: information</p>
         * <p>*   WARN: warning</p>
         * <p>*   CRITICAL: critical</p>
         */
        @NameInMap("Level")
        public String level;

        public static PutMetricRuleTargetsResponseBodyFailDataTargetsTarget build(java.util.Map<String, ?> map) throws Exception {
            PutMetricRuleTargetsResponseBodyFailDataTargetsTarget self = new PutMetricRuleTargetsResponseBodyFailDataTargetsTarget();
            return TeaModel.build(map, self);
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutMetricRuleTargetsResponseBodyFailDataTargetsTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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
        /**
         * <p>The information about the resource for which alerts are triggered.</p>
         */
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
