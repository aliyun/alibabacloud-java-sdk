// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateTaskResponseBody self = new CloudCreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateTaskResponseBody setData(CloudCreateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("AgentTimeout")
        public String agentTimeout;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("AnswerRate")
        public String answerRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoComplete")
        public Long autoComplete;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoStart")
        public String autoStart;

        /**
         * <strong>example:</strong>
         * <p>2016-04-11</p>
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
         * <p>1</p>
         */
        @NameInMap("AutoStop")
        public String autoStop;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("Cnos")
        public String cnos;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Concurrency")
        public String concurrency;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
         * <p>示例值示例值</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <strong>example:</strong>
         * <p>11</p>
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
         * <p>330</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>示例值</p>
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
         * <p>1</p>
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
         * <p>10</p>
         */
        @NameInMap("Wrapup")
        public String wrapup;

        public static CloudCreateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateTaskResponseBodyData self = new CloudCreateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateTaskResponseBodyData setAgentTimeout(String agentTimeout) {
            this.agentTimeout = agentTimeout;
            return this;
        }
        public String getAgentTimeout() {
            return this.agentTimeout;
        }

        public CloudCreateTaskResponseBodyData setAnswerRate(String answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public String getAnswerRate() {
            return this.answerRate;
        }

        public CloudCreateTaskResponseBodyData setAutoComplete(Long autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public Long getAutoComplete() {
            return this.autoComplete;
        }

        public CloudCreateTaskResponseBodyData setAutoStart(String autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public String getAutoStart() {
            return this.autoStart;
        }

        public CloudCreateTaskResponseBodyData setAutoStartDay(String autoStartDay) {
            this.autoStartDay = autoStartDay;
            return this;
        }
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        public CloudCreateTaskResponseBodyData setAutoStartTime(String autoStartTime) {
            this.autoStartTime = autoStartTime;
            return this;
        }
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        public CloudCreateTaskResponseBodyData setAutoStop(String autoStop) {
            this.autoStop = autoStop;
            return this;
        }
        public String getAutoStop() {
            return this.autoStop;
        }

        public CloudCreateTaskResponseBodyData setAutoStopDay(String autoStopDay) {
            this.autoStopDay = autoStopDay;
            return this;
        }
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        public CloudCreateTaskResponseBodyData setAutoStopTime(String autoStopTime) {
            this.autoStopTime = autoStopTime;
            return this;
        }
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        public CloudCreateTaskResponseBodyData setCnos(String cnos) {
            this.cnos = cnos;
            return this;
        }
        public String getCnos() {
            return this.cnos;
        }

        public CloudCreateTaskResponseBodyData setConcurrency(String concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public String getConcurrency() {
            return this.concurrency;
        }

        public CloudCreateTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateTaskResponseBodyData setCustomerClids(String customerClids) {
            this.customerClids = customerClids;
            return this;
        }
        public String getCustomerClids() {
            return this.customerClids;
        }

        public CloudCreateTaskResponseBodyData setCustomerMoh(String customerMoh) {
            this.customerMoh = customerMoh;
            return this;
        }
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        public CloudCreateTaskResponseBodyData setCustomerTimeout(String customerTimeout) {
            this.customerTimeout = customerTimeout;
            return this;
        }
        public String getCustomerTimeout() {
            return this.customerTimeout;
        }

        public CloudCreateTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudCreateTaskResponseBodyData setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudCreateTaskResponseBodyData setIsRandom(String isRandom) {
            this.isRandom = isRandom;
            return this;
        }
        public String getIsRandom() {
            return this.isRandom;
        }

        public CloudCreateTaskResponseBodyData setIvrId(String ivrId) {
            this.ivrId = ivrId;
            return this;
        }
        public String getIvrId() {
            return this.ivrId;
        }

        public CloudCreateTaskResponseBodyData setMaxWaitTime(String maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public String getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public CloudCreateTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudCreateTaskResponseBodyData setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudCreateTaskResponseBodyData setPredictAdjust(String predictAdjust) {
            this.predictAdjust = predictAdjust;
            return this;
        }
        public String getPredictAdjust() {
            return this.predictAdjust;
        }

        public CloudCreateTaskResponseBodyData setQuotiety(String quotiety) {
            this.quotiety = quotiety;
            return this;
        }
        public String getQuotiety() {
            return this.quotiety;
        }

        public CloudCreateTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudCreateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudCreateTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloudCreateTaskResponseBodyData setUserFields(String userFields) {
            this.userFields = userFields;
            return this;
        }
        public String getUserFields() {
            return this.userFields;
        }

        public CloudCreateTaskResponseBodyData setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

}
