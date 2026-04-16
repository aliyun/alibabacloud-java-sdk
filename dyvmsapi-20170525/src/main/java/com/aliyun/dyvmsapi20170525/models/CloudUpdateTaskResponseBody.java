// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUpdateTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudUpdateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudUpdateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudUpdateTaskResponseBody self = new CloudUpdateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudUpdateTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudUpdateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudUpdateTaskResponseBody setData(CloudUpdateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudUpdateTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudUpdateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudUpdateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudUpdateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AgentTimeout")
        public String agentTimeout;

        /**
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("AnswerRate")
        public String answerRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoComplete")
        public Long autoComplete;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoStart")
        public String autoStart;

        /**
         * <strong>example:</strong>
         * <p>2026-02-11</p>
         */
        @NameInMap("AutoStartDay")
        public String autoStartDay;

        /**
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("AutoStartTime")
        public String autoStartTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoStop")
        public String autoStop;

        /**
         * <strong>example:</strong>
         * <p>2026-02-11</p>
         */
        @NameInMap("AutoStopDay")
        public String autoStopDay;

        /**
         * <strong>example:</strong>
         * <p>17:00:00</p>
         */
        @NameInMap("AutoStopTime")
        public String autoStopTime;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cnos")
        public String cnos;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public String concurrency;

        /**
         * <strong>example:</strong>
         * <p>2026-02-10 14:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>42366453,74565327</p>
         */
        @NameInMap("CustomerClids")
        public String customerClids;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerMoh")
        public String customerMoh;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CustomerTimeout")
        public String customerTimeout;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>8001654</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsRandom")
        public String isRandom;

        /**
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("IvrId")
        public String ivrId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxWaitTime")
        public String maxWaitTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2026-01-0114:00:00</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("PredictAdjust")
        public String predictAdjust;

        /**
         * <strong>example:</strong>
         * <p>0.33</p>
         */
        @NameInMap("Quotiety")
        public String quotiety;

        /**
         * <strong>example:</strong>
         * <p>2026-02-10 15:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         */
        @NameInMap("UserFields")
        public String userFields;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Wrapup")
        public String wrapup;

        public static CloudUpdateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudUpdateTaskResponseBodyData self = new CloudUpdateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudUpdateTaskResponseBodyData setAgentTimeout(String agentTimeout) {
            this.agentTimeout = agentTimeout;
            return this;
        }
        public String getAgentTimeout() {
            return this.agentTimeout;
        }

        public CloudUpdateTaskResponseBodyData setAnswerRate(String answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public String getAnswerRate() {
            return this.answerRate;
        }

        public CloudUpdateTaskResponseBodyData setAutoComplete(Long autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public Long getAutoComplete() {
            return this.autoComplete;
        }

        public CloudUpdateTaskResponseBodyData setAutoStart(String autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public String getAutoStart() {
            return this.autoStart;
        }

        public CloudUpdateTaskResponseBodyData setAutoStartDay(String autoStartDay) {
            this.autoStartDay = autoStartDay;
            return this;
        }
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        public CloudUpdateTaskResponseBodyData setAutoStartTime(String autoStartTime) {
            this.autoStartTime = autoStartTime;
            return this;
        }
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        public CloudUpdateTaskResponseBodyData setAutoStop(String autoStop) {
            this.autoStop = autoStop;
            return this;
        }
        public String getAutoStop() {
            return this.autoStop;
        }

        public CloudUpdateTaskResponseBodyData setAutoStopDay(String autoStopDay) {
            this.autoStopDay = autoStopDay;
            return this;
        }
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        public CloudUpdateTaskResponseBodyData setAutoStopTime(String autoStopTime) {
            this.autoStopTime = autoStopTime;
            return this;
        }
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        public CloudUpdateTaskResponseBodyData setCnos(String cnos) {
            this.cnos = cnos;
            return this;
        }
        public String getCnos() {
            return this.cnos;
        }

        public CloudUpdateTaskResponseBodyData setConcurrency(String concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public String getConcurrency() {
            return this.concurrency;
        }

        public CloudUpdateTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudUpdateTaskResponseBodyData setCustomerClids(String customerClids) {
            this.customerClids = customerClids;
            return this;
        }
        public String getCustomerClids() {
            return this.customerClids;
        }

        public CloudUpdateTaskResponseBodyData setCustomerMoh(String customerMoh) {
            this.customerMoh = customerMoh;
            return this;
        }
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        public CloudUpdateTaskResponseBodyData setCustomerTimeout(String customerTimeout) {
            this.customerTimeout = customerTimeout;
            return this;
        }
        public String getCustomerTimeout() {
            return this.customerTimeout;
        }

        public CloudUpdateTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudUpdateTaskResponseBodyData setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudUpdateTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudUpdateTaskResponseBodyData setIsRandom(String isRandom) {
            this.isRandom = isRandom;
            return this;
        }
        public String getIsRandom() {
            return this.isRandom;
        }

        public CloudUpdateTaskResponseBodyData setIvrId(String ivrId) {
            this.ivrId = ivrId;
            return this;
        }
        public String getIvrId() {
            return this.ivrId;
        }

        public CloudUpdateTaskResponseBodyData setMaxWaitTime(String maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public String getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public CloudUpdateTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudUpdateTaskResponseBodyData setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudUpdateTaskResponseBodyData setPredictAdjust(String predictAdjust) {
            this.predictAdjust = predictAdjust;
            return this;
        }
        public String getPredictAdjust() {
            return this.predictAdjust;
        }

        public CloudUpdateTaskResponseBodyData setQuotiety(String quotiety) {
            this.quotiety = quotiety;
            return this;
        }
        public String getQuotiety() {
            return this.quotiety;
        }

        public CloudUpdateTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudUpdateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudUpdateTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloudUpdateTaskResponseBodyData setUserFields(String userFields) {
            this.userFields = userFields;
            return this;
        }
        public String getUserFields() {
            return this.userFields;
        }

        public CloudUpdateTaskResponseBodyData setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

}
