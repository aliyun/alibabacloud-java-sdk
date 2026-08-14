// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The dynamic error message used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>For example, if <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The monitoring rule information of the DTS task.</p>
     */
    @NameInMap("MonitorRules")
    public java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> monitorRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CA14388-DD89-4A7B-8CDD-884A10CE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The Kafka topics.</p>
     */
    @NameInMap("Topics")
    public java.util.List<String> topics;

    public static DescribeJobMonitorRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMonitorRuleResponseBody self = new DescribeJobMonitorRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobMonitorRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobMonitorRuleResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeJobMonitorRuleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeJobMonitorRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeJobMonitorRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeJobMonitorRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobMonitorRuleResponseBody setMonitorRules(java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> monitorRules) {
        this.monitorRules = monitorRules;
        return this;
    }
    public java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> getMonitorRules() {
        return this.monitorRules;
    }

    public DescribeJobMonitorRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobMonitorRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeJobMonitorRuleResponseBody setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public static class DescribeJobMonitorRuleResponseBodyMonitorRules extends TeaModel {
        /**
         * <p>The threshold that triggers a latency alert. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DelayRuleTime")
        public Long delayRuleTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bi6e22ay243****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task type of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: data migration or data synchronization task.</li>
         * <li><strong>full_check</strong>: associated full data validation task.</li>
         * <li><strong>etl_check</strong>: associated incremental data validation task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NoticeValue")
        public Integer noticeValue;

        /**
         * <p>The statistical period of the incremental data validation task. Unit: minutes.</p>
         * <blockquote>
         * <p>Valid values: 1, 5, 10, and 30 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The phone numbers of the contacts to be notified when an alert is triggered. Multiple phone numbers are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>Indicates whether the monitoring rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: enabled.</li>
         * <li><strong>N</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of periods for the incremental data validation task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Times")
        public Integer times;

        /**
         * <p>The type of the monitoring rule. Valid values:</p>
         * <ul>
         * <li><strong>delay</strong>: latency alert.</li>
         * <li><strong>error</strong>: anomaly alert.</li>
         * <li><strong>full_timeout</strong>: alert for the runtime of the full data module.</li>
         * <li><strong>warn</strong>: notification alert (the task succeeded but the result did not meet expectations).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeJobMonitorRuleResponseBodyMonitorRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobMonitorRuleResponseBodyMonitorRules self = new DescribeJobMonitorRuleResponseBodyMonitorRules();
            return TeaModel.build(map, self);
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setDelayRuleTime(Long delayRuleTime) {
            this.delayRuleTime = delayRuleTime;
            return this;
        }
        public Long getDelayRuleTime() {
            return this.delayRuleTime;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setNoticeValue(Integer noticeValue) {
            this.noticeValue = noticeValue;
            return this;
        }
        public Integer getNoticeValue() {
            return this.noticeValue;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

        public DescribeJobMonitorRuleResponseBodyMonitorRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
