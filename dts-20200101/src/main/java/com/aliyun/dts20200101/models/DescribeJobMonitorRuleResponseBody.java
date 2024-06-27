// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeJobMonitorRuleResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter will be removed in the future.</p>
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
     * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> If the specified <strong>DtsJobId</strong> parameter is invalid, <strong>The Value of Input Parameter %s is not valid</strong> is returned for <strong>ErrMessage</strong> and <strong>DtsJobId</strong> is returned for <strong>DynamicMessage</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
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
     * <p>The monitoring rules of the DTS task.</p>
     */
    @NameInMap("MonitorRules")
    public java.util.List<DescribeJobMonitorRuleResponseBodyMonitorRules> monitorRules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CA14388-DD89-4A7B-8CDD-884A10CE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>:The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The topics of all subtasks in the distributed change tracking task.</p>
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
         * <p>The threshold that triggers the alert.</p>
         * <ul>
         * <li>If the request parameter <strong>Type</strong> of the <a href="https://help.aliyun.com/document_detail/212332.html">CreateJobMonitorRule</a> operation is set to <strong>delay</strong>, the unit of DelayRuleTime is seconds.</li>
         * <li>If the request parameter <strong>Type</strong> of the <a href="https://help.aliyun.com/document_detail/212332.html">CreateJobMonitorRule</a> operation is set to <strong>full_timeout</strong>, the unit of DelayRuleTime is hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("DelayRuleTime")
        public Long delayRuleTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("NoticeValue")
        public Integer noticeValue;

        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The mobile phone numbers that receive alert notifications. Multiple mobile numbers are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>Indicates whether the monitoring rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: The monitoring rule is enabled.</li>
         * <li><strong>N</strong>: The monitoring rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("Times")
        public Integer times;

        /**
         * <p>The type of the monitoring rule. Valid values:</p>
         * <ul>
         * <li><strong>delay</strong>: If the task latency reaches the threshold, an alert is triggered.</li>
         * <li><strong>error</strong>: If an exception occurs, an alert is triggered.</li>
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
