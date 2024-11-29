// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMetricRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The failed data.</p>
     */
    @NameInMap("FailData")
    public PutMetricRuleTargetsResponseBodyFailData failData;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A569B0D-9055-58AF-9E82-BAEAF95C0FD5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The ARN of the resource. Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. SMQ, Auto Scaling, Simple Log Service, and Function Compute are supported. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. The following part describes the ARN of SMQ and the parameters in the ARN:</p>
         * <ul>
         * <li><p>{Service name abbreviation}: mns.</p>
         * </li>
         * <li><p>{userId}: the ID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p>{regionId}: the region ID of the SMQ queue or topic.</p>
         * </li>
         * <li><p>{Resource type}: the type of the resource for which alerts are triggered. Valid values:</p>
         * <ul>
         * <li><strong>queues</strong></li>
         * <li><strong>topics</strong></li>
         * </ul>
         * </li>
         * <li><p>{Resource name}: the resource name.</p>
         * <ul>
         * <li>If the resource type is <strong>queues</strong>, the resource name is the queue name.</li>
         * <li>If the resource type is <strong>topics</strong>, the resource name is the topic name.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:111:/queues/test/message</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the resource for which alerts are triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The alert level. Valid values:</p>
         * <ul>
         * <li>INFO</li>
         * <li>WARN</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
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
         * <p>The information about the resources for which alerts are triggered.</p>
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
