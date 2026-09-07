// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvDropMetricsRuleResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeEnvDropMetricsRuleResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7781D4A-2818-41E7-B7BB-79D809E9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnvDropMetricsRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvDropMetricsRuleResponseBody self = new DescribeEnvDropMetricsRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvDropMetricsRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvDropMetricsRuleResponseBody setData(DescribeEnvDropMetricsRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvDropMetricsRuleResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvDropMetricsRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvDropMetricsRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnvDropMetricsRuleResponseBodyData extends TeaModel {
        /**
         * <p>The metrics to be dropped. Metrics are separated by line breaks.</p>
         * 
         * <strong>example:</strong>
         * <p>kube_pod_created</p>
         */
        @NameInMap("DropMetrics")
        public String dropMetrics;

        /**
         * <p>The name of the metric drop rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ruleName1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeEnvDropMetricsRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvDropMetricsRuleResponseBodyData self = new DescribeEnvDropMetricsRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvDropMetricsRuleResponseBodyData setDropMetrics(String dropMetrics) {
            this.dropMetrics = dropMetrics;
            return this;
        }
        public String getDropMetrics() {
            return this.dropMetrics;
        }

        public DescribeEnvDropMetricsRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
