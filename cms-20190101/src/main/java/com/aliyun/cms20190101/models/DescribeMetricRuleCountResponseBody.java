// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleCountResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of alert rules without active alerts.</p>
     */
    @NameInMap("MetricRuleCount")
    public DescribeMetricRuleCountResponseBodyMetricRuleCount metricRuleCount;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of alert rules in each state.</p>
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
        @NameInMap("Alarm")
        public Integer alarm;

        /**
         * <p>The total number of alert rules.</p>
         */
        @NameInMap("Disable")
        public Integer disable;

        /**
         * <p>The number of disabled alert rules.</p>
         */
        @NameInMap("Nodata")
        public Integer nodata;

        /**
         * <p>The number of alert rules without data.</p>
         */
        @NameInMap("Ok")
        public Integer ok;

        /**
         * <p>The number of alert rules with active alerts.</p>
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
