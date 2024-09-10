// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the call was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>786E92D2-AC66-4250-B76F-F1E2FCDDBA1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the resource for which alerts are triggered.</p>
     */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Format: <code>acs:{Service name abbreviation}:{regionId}:{userId}:/{Resource type}/{Resource name}/message</code>. Example: <code>acs:mns:cn-hangzhou:120886317861****:/queues/test123/message</code>. Fields:</p>
         * <ul>
         * <li>{Service name abbreviation}: the abbreviation of the service name. Valid value: mns.</li>
         * <li>{userId}: the ID of the Alibaba Cloud account.</li>
         * <li>{regionId}: the region ID of the message queue or topic.</li>
         * <li>{Resource type}<code>: the type of the resource for which alerts are triggered. Valid values: - **queues** - **topics** {Resource name}: the name of the resource. - If the resource type is set to **queues**, the resource name is the name of the message queue. - If the resource type is set to **topics**, the resource name is the name of the topic.</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</p>
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
         * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;customField1&quot;:&quot;value1&quot;,&quot;customField2&quot;:&quot;$.name&quot;}</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <ul>
         * <li>INFO: information</li>
         * <li>WARN: warning</li>
         * <li>CRITICAL: critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INFO&quot;, &quot;WARN&quot;, &quot;CRITICAL&quot;]</p>
         */
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

        public DescribeMetricRuleTargetsResponseBodyTargetsTarget setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
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
