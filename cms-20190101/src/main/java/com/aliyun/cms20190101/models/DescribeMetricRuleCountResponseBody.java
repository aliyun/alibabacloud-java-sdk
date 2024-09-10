// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponseBody extends TeaModel {
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
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of alert rules in each state.</p>
     */
    @NameInMap("MetricRuleCount")
    public DescribeMetricRuleCountResponseBodyMetricRuleCount metricRuleCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FF38D33A-67C1-40EB-AB65-FAEE51EDB644</p>
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

    public static DescribeMetricRuleCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleCountResponseBody self = new DescribeMetricRuleCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricRuleCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricRuleCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricRuleCountResponseBody setMetricRuleCount(DescribeMetricRuleCountResponseBodyMetricRuleCount metricRuleCount) {
        this.metricRuleCount = metricRuleCount;
        return this;
    }
    public DescribeMetricRuleCountResponseBodyMetricRuleCount getMetricRuleCount() {
        return this.metricRuleCount;
    }

    public DescribeMetricRuleCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricRuleCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMetricRuleCountResponseBodyMetricRuleCount extends TeaModel {
        /**
         * <p>The number of alert rules with active alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Alarm")
        public Integer alarm;

        /**
         * <p>The number of disabled alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Disable")
        public Integer disable;

        /**
         * <p>The number of alert rules without data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Nodata")
        public Integer nodata;

        /**
         * <p>The number of alert rules without active alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Ok")
        public Integer ok;

        /**
         * <p>The total number of alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static DescribeMetricRuleCountResponseBodyMetricRuleCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricRuleCountResponseBodyMetricRuleCount self = new DescribeMetricRuleCountResponseBodyMetricRuleCount();
            return TeaModel.build(map, self);
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setAlarm(Integer alarm) {
            this.alarm = alarm;
            return this;
        }
        public Integer getAlarm() {
            return this.alarm;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setDisable(Integer disable) {
            this.disable = disable;
            return this;
        }
        public Integer getDisable() {
            return this.disable;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setNodata(Integer nodata) {
            this.nodata = nodata;
            return this;
        }
        public Integer getNodata() {
            return this.nodata;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setOk(Integer ok) {
            this.ok = ok;
            return this;
        }
        public Integer getOk() {
            return this.ok;
        }

        public DescribeMetricRuleCountResponseBodyMetricRuleCount setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
