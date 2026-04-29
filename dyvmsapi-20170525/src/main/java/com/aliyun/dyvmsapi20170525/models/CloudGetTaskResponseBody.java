// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetTaskResponseBody self = new CloudGetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetTaskResponseBody setData(CloudGetTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudGetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetTaskResponseBodyDataTaskProperty extends TeaModel {
        /**
         * <p>adjustStep</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AdjustStep")
        public String adjustStep;

        /**
         * <p>座席超时时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AgentTimeout")
        public String agentTimeout;

        /**
         * <p>已废弃。座席利用率</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("AgentUtilization")
        public String agentUtilization;

        /**
         * <p>初始化预计客户接通率</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AnswerRate")
        public String answerRate;

        /**
         * <p>自动完成，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoComplete")
        public String autoComplete;

        /**
         * <p>定时开始，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoStart")
        public String autoStart;

        /**
         * <p>定时开始日期，格式：yyyy-MM-dd，如：2017-02-11</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-11</p>
         */
        @NameInMap("AutoStartDay")
        public String autoStartDay;

        /**
         * <p>定时开始时间，格式：HH:mm:ss，如：08:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("AutoStartTime")
        public String autoStartTime;

        /**
         * <p>定时完成，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoStop")
        public String autoStop;

        /**
         * <p>定时完成日期，格式：yyyy-MM-dd，如：2017-02-11</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-11</p>
         */
        @NameInMap("AutoStopDay")
        public String autoStopDay;

        /**
         * <p>定时完成时间，格式：HH:mm:ss，如：17:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>17:00:00</p>
         */
        @NameInMap("AutoStopTime")
        public String autoStopTime;

        /**
         * <p>呼叫方式，0.连续呼叫 1.间隔呼叫</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoTaskType")
        public String autoTaskType;

        /**
         * <p>间隔呼叫时间段，呼叫的时间段配置。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22。</p>
         * 
         * <strong>example:</strong>
         * <p>9,22</p>
         */
        @NameInMap("AutoTriggerTimeStrategy")
        public String autoTriggerTimeStrategy;

        /**
         * <p>座席当日接听数限制，JsonArray格式[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
         */
        @NameInMap("CallLimitStrategy")
        public String callLimitStrategy;

        /**
         * <p>座席分配规则，1.随机 2.顺序 3.座席未进线最大时（从上一次呼叫结束到当前的总时长） 4.座席状态[空闲]最长时长（座席最近一次切换为空闲状态的持续时长）</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallStrategy")
        public String callStrategy;

        /**
         * <p>座席通道变量，JsonArray格式[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         */
        @NameInMap("CallVariables")
        public String callVariables;

        /**
         * <p>已废弃。给企业推送任务状态的URL地址</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>已废弃。热线号码组</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("ClidGroup")
        public String clidGroup;

        /**
         * <p>外显规则，Json格式，外显号码选择规则：默认区号，是否匹配省会等；如：{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}</p>
         */
        @NameInMap("ClidProperty")
        public String clidProperty;

        /**
         * <p>座席工号列表</p>
         * 
         * <strong>example:</strong>
         * <p>111,222</p>
         */
        @NameInMap("Cnos")
        public String cnos;

        /**
         * <p>最大并发限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Concurrency")
        public String concurrency;

        /**
         * <p>任务创建时间 ，格式为： yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-10 14:07:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>已废弃。推送重试次数 最大5次</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CurlRetryTimes")
        public String curlRetryTimes;

        /**
         * <p>客户侧外显规则，1.随机 2.按区号</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CustomerClidType")
        public String customerClidType;

        /**
         * <p>外显号码比例配置内容，JsonArray格式[{&quot;number&quot;:&quot;123,345&quot;,&quot;weight&quot;:&quot;5&quot;},{&quot;number&quot;:&quot;567,789&quot;,&quot;weight&quot;:&quot;5&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;123,345&quot;,&quot;weight&quot;:&quot;5&quot;},{&quot;number&quot;:&quot;567,789&quot;,&quot;weight&quot;:&quot;5&quot;}]</p>
         */
        @NameInMap("CustomerClidWeight")
        public String customerClidWeight;

        /**
         * <p>外显号码比例配置开关，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CustomerClidWeightFlag")
        public String customerClidWeightFlag;

        /**
         * <p>客户侧外显号码列表</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("CustomerClids")
        public String customerClids;

        /**
         * <p>客户侧外显号码类型，1.外显固话 2.外显手机号 4.外显号码池 5.外显导航</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomerClidsCategory")
        public String customerClidsCategory;

        /**
         * <p>客户侧等待音</p>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("CustomerMoh")
        public String customerMoh;

        /**
         * <p>客户超时时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CustomerTimeout")
        public String customerTimeout;

        /**
         * <p>客户侧提示音</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerVoice")
        public String customerVoice;

        /**
         * <p>任务描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>定时完成时强制结束任务。开启配置后，当任务到定时完成时间时无论任务中的号码是否已经呼完，均将任务状态设置为结束。适用于对数据有呼叫时间限制的场景。注：任务在结束状态时无法再次启动。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ForceEndFlag")
        public String forceEndFlag;

        /**
         * <p>外呼任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>11059</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>随机呼叫，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsRandom")
        public String isRandom;

        /**
         * <p>暂停后重新预热，0.关闭，1开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsRewarm")
        public String isRewarm;

        /**
         * <p>语音导航Id</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("IvrId")
        public String ivrId;

        /**
         * <p>座席最大等待时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxWaitTime")
        public String maxWaitTime;

        /**
         * <p>最小可用座席数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinAvailableAgentCount")
        public String minAvailableAgentCount;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("OverCallLimitCnos")
        public String overCallLimitCnos;

        /**
         * <p>任务结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <p>任务暂停时长(针对自动启动时间段) 单位分钟</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PauseDuration")
        public String pauseDuration;

        /**
         * <p>任务暂停时间点</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-14 16:51:11</p>
         */
        @NameInMap("PauseTime")
        public String pauseTime;

        /**
         * <p>超呼率</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PredictAdjust")
        public String predictAdjust;

        /**
         * <p>骚扰率，支持小数，精确到小数点两位</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        @NameInMap("Quotiety")
        public String quotiety;

        /**
         * <p>重试策略，「基础模式」数据结构为Json格式<code>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</code>格式说明：retry是重试次数，round是第几次重试，time是第几次重试间隔的时间：1-1-1，第一个1是天，第二个1是小时，第三个1是分钟「高级模式」高级模式需要开启「号码状态识别」服务后。目前只支持「自动外呼」任务模式。数据结构为JsonArray格式 <code>[{&quot;condition&quot;:{&quot;sipCause&quot;:[710,719]},&quot;retry&quot;:1,&quot;sort&quot;:1,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;0-0-10&quot;}]},{&quot;condition&quot;:{&quot;sipCause&quot;:[800]},&quot;retry&quot;:1,&quot;sort&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:2,&quot;time&quot;:&quot;0-0-10&quot;}]}]</code>格式说明：condition是重试条件，sort是重试条件的顺序，其余字段与基础模式一致</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</p>
         */
        @NameInMap("RetryStrategy")
        public String retryStrategy;

        /**
         * <p>重试仅当天生效，0.关闭 1.开启，删除待重试的数据和待呼叫的数据 2.开启，删除待重试的数据 3.开启，删除待呼叫的数据</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetryStrategyOnlyToday")
        public String retryStrategyOnlyToday;

        /**
         * <p>已废弃</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("StandbyCnos")
        public String standbyCnos;

        /**
         * <p>任务开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-10 14:11:15</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>任务状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>已废弃。任务级呼叫属性 json格式{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}，仅做呼叫控制用，不放通道变量</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        @NameInMap("TaskFields")
        public String taskFields;

        /**
         * <p>禁止呼叫时间限制，在特定的时间段内禁止呼叫。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22。</p>
         * 
         * <strong>example:</strong>
         * <p>9,22</p>
         */
        @NameInMap("TimeStrategy")
        public String timeStrategy;

        /**
         * <p>任务类型，1.预测外呼任务 2.自动外呼任务</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>任务自定义字段，JsonArray格式[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         */
        @NameInMap("UserFields")
        public String userFields;

        /**
         * <p>任务预热时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("WarmUpDuration")
        public String warmUpDuration;

        /**
         * <p>座席整理时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Wrapup")
        public String wrapup;

        public static CloudGetTaskResponseBodyDataTaskProperty build(java.util.Map<String, ?> map) throws Exception {
            CloudGetTaskResponseBodyDataTaskProperty self = new CloudGetTaskResponseBodyDataTaskProperty();
            return TeaModel.build(map, self);
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAdjustStep(String adjustStep) {
            this.adjustStep = adjustStep;
            return this;
        }
        public String getAdjustStep() {
            return this.adjustStep;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAgentTimeout(String agentTimeout) {
            this.agentTimeout = agentTimeout;
            return this;
        }
        public String getAgentTimeout() {
            return this.agentTimeout;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAgentUtilization(String agentUtilization) {
            this.agentUtilization = agentUtilization;
            return this;
        }
        public String getAgentUtilization() {
            return this.agentUtilization;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAnswerRate(String answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public String getAnswerRate() {
            return this.answerRate;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoComplete(String autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public String getAutoComplete() {
            return this.autoComplete;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStart(String autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public String getAutoStart() {
            return this.autoStart;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStartDay(String autoStartDay) {
            this.autoStartDay = autoStartDay;
            return this;
        }
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStartTime(String autoStartTime) {
            this.autoStartTime = autoStartTime;
            return this;
        }
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStop(String autoStop) {
            this.autoStop = autoStop;
            return this;
        }
        public String getAutoStop() {
            return this.autoStop;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStopDay(String autoStopDay) {
            this.autoStopDay = autoStopDay;
            return this;
        }
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoStopTime(String autoStopTime) {
            this.autoStopTime = autoStopTime;
            return this;
        }
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoTaskType(String autoTaskType) {
            this.autoTaskType = autoTaskType;
            return this;
        }
        public String getAutoTaskType() {
            return this.autoTaskType;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setAutoTriggerTimeStrategy(String autoTriggerTimeStrategy) {
            this.autoTriggerTimeStrategy = autoTriggerTimeStrategy;
            return this;
        }
        public String getAutoTriggerTimeStrategy() {
            return this.autoTriggerTimeStrategy;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCallLimitStrategy(String callLimitStrategy) {
            this.callLimitStrategy = callLimitStrategy;
            return this;
        }
        public String getCallLimitStrategy() {
            return this.callLimitStrategy;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCallStrategy(String callStrategy) {
            this.callStrategy = callStrategy;
            return this;
        }
        public String getCallStrategy() {
            return this.callStrategy;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCallVariables(String callVariables) {
            this.callVariables = callVariables;
            return this;
        }
        public String getCallVariables() {
            return this.callVariables;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setClidGroup(String clidGroup) {
            this.clidGroup = clidGroup;
            return this;
        }
        public String getClidGroup() {
            return this.clidGroup;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setClidProperty(String clidProperty) {
            this.clidProperty = clidProperty;
            return this;
        }
        public String getClidProperty() {
            return this.clidProperty;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCnos(String cnos) {
            this.cnos = cnos;
            return this;
        }
        public String getCnos() {
            return this.cnos;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setConcurrency(String concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public String getConcurrency() {
            return this.concurrency;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCurlRetryTimes(String curlRetryTimes) {
            this.curlRetryTimes = curlRetryTimes;
            return this;
        }
        public String getCurlRetryTimes() {
            return this.curlRetryTimes;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerClidType(String customerClidType) {
            this.customerClidType = customerClidType;
            return this;
        }
        public String getCustomerClidType() {
            return this.customerClidType;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerClidWeight(String customerClidWeight) {
            this.customerClidWeight = customerClidWeight;
            return this;
        }
        public String getCustomerClidWeight() {
            return this.customerClidWeight;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerClidWeightFlag(String customerClidWeightFlag) {
            this.customerClidWeightFlag = customerClidWeightFlag;
            return this;
        }
        public String getCustomerClidWeightFlag() {
            return this.customerClidWeightFlag;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerClids(String customerClids) {
            this.customerClids = customerClids;
            return this;
        }
        public String getCustomerClids() {
            return this.customerClids;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerClidsCategory(String customerClidsCategory) {
            this.customerClidsCategory = customerClidsCategory;
            return this;
        }
        public String getCustomerClidsCategory() {
            return this.customerClidsCategory;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerMoh(String customerMoh) {
            this.customerMoh = customerMoh;
            return this;
        }
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerTimeout(String customerTimeout) {
            this.customerTimeout = customerTimeout;
            return this;
        }
        public String getCustomerTimeout() {
            return this.customerTimeout;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setCustomerVoice(String customerVoice) {
            this.customerVoice = customerVoice;
            return this;
        }
        public String getCustomerVoice() {
            return this.customerVoice;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setForceEndFlag(String forceEndFlag) {
            this.forceEndFlag = forceEndFlag;
            return this;
        }
        public String getForceEndFlag() {
            return this.forceEndFlag;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setIsRandom(String isRandom) {
            this.isRandom = isRandom;
            return this;
        }
        public String getIsRandom() {
            return this.isRandom;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setIsRewarm(String isRewarm) {
            this.isRewarm = isRewarm;
            return this;
        }
        public String getIsRewarm() {
            return this.isRewarm;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setIvrId(String ivrId) {
            this.ivrId = ivrId;
            return this;
        }
        public String getIvrId() {
            return this.ivrId;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setMaxWaitTime(String maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public String getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setMinAvailableAgentCount(String minAvailableAgentCount) {
            this.minAvailableAgentCount = minAvailableAgentCount;
            return this;
        }
        public String getMinAvailableAgentCount() {
            return this.minAvailableAgentCount;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setOverCallLimitCnos(String overCallLimitCnos) {
            this.overCallLimitCnos = overCallLimitCnos;
            return this;
        }
        public String getOverCallLimitCnos() {
            return this.overCallLimitCnos;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setPauseDuration(String pauseDuration) {
            this.pauseDuration = pauseDuration;
            return this;
        }
        public String getPauseDuration() {
            return this.pauseDuration;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setPauseTime(String pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }
        public String getPauseTime() {
            return this.pauseTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setPredictAdjust(String predictAdjust) {
            this.predictAdjust = predictAdjust;
            return this;
        }
        public String getPredictAdjust() {
            return this.predictAdjust;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setQuotiety(String quotiety) {
            this.quotiety = quotiety;
            return this;
        }
        public String getQuotiety() {
            return this.quotiety;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setRetryStrategy(String retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public String getRetryStrategy() {
            return this.retryStrategy;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setRetryStrategyOnlyToday(String retryStrategyOnlyToday) {
            this.retryStrategyOnlyToday = retryStrategyOnlyToday;
            return this;
        }
        public String getRetryStrategyOnlyToday() {
            return this.retryStrategyOnlyToday;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setStandbyCnos(String standbyCnos) {
            this.standbyCnos = standbyCnos;
            return this;
        }
        public String getStandbyCnos() {
            return this.standbyCnos;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setTaskFields(String taskFields) {
            this.taskFields = taskFields;
            return this;
        }
        public String getTaskFields() {
            return this.taskFields;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setTimeStrategy(String timeStrategy) {
            this.timeStrategy = timeStrategy;
            return this;
        }
        public String getTimeStrategy() {
            return this.timeStrategy;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setUserFields(String userFields) {
            this.userFields = userFields;
            return this;
        }
        public String getUserFields() {
            return this.userFields;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setWarmUpDuration(String warmUpDuration) {
            this.warmUpDuration = warmUpDuration;
            return this;
        }
        public String getWarmUpDuration() {
            return this.warmUpDuration;
        }

        public CloudGetTaskResponseBodyDataTaskProperty setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudGetTaskResponseBodyData extends TeaModel {
        /**
         * <p>任务配置信息</p>
         */
        @NameInMap("TaskProperty")
        public CloudGetTaskResponseBodyDataTaskProperty taskProperty;

        public static CloudGetTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetTaskResponseBodyData self = new CloudGetTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetTaskResponseBodyData setTaskProperty(CloudGetTaskResponseBodyDataTaskProperty taskProperty) {
            this.taskProperty = taskProperty;
            return this;
        }
        public CloudGetTaskResponseBodyDataTaskProperty getTaskProperty() {
            return this.taskProperty;
        }

    }

}
