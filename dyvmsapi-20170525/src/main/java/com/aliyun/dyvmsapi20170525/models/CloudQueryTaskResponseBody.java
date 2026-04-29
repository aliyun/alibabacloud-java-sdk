// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryTaskResponseBody self = new CloudQueryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryTaskResponseBody setData(CloudQueryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryTaskResponseBodyDataTaskProperties extends TeaModel {
        /**
         * <p>外呼组号</p>
         * 
         * <strong>example:</strong>
         * <p>WH124</p>
         */
        @NameInMap("AgentGroup")
        public String agentGroup;

        /**
         * <p>座席超时时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AgentTimeout")
        public Long agentTimeout;

        /**
         * <p>初始化预计客户接通率</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("AnswerRate")
        public Long answerRate;

        /**
         * <p>自动完成，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoComplete")
        public Long autoComplete;

        /**
         * <p>定时开始，0.关闭 1.开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoStart")
        public Long autoStart;

        /**
         * <p>定时开始日期，格式：yyyy-MM-dd，如：2017-02-11</p>
         * 
         * <strong>example:</strong>
         * <p>2017-02-11</p>
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
        public Long autoStop;

        /**
         * <p>定时完成日期，格式：yyyy-MM-dd，如：2017-02-11</p>
         * 
         * <strong>example:</strong>
         * <p>2017-02-11</p>
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
         * <p>50</p>
         */
        @NameInMap("AutoTaskType")
        public Long autoTaskType;

        /**
         * <p>间隔呼叫时间段，呼叫的时间段配置。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22</p>
         * 
         * <strong>example:</strong>
         * <p>9,22</p>
         */
        @NameInMap("AutoTriggerTimeStrategy")
        public String autoTriggerTimeStrategy;

        /**
         * <p>指定座席方式，1.座席工号列表 2.外呼组</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallGroupType")
        public Long callGroupType;

        /**
         * <p>座席当日接听数限制，JsonArray格式[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
         */
        @NameInMap("CallLimitStrategy")
        public String callLimitStrategy;

        /**
         * <p>呼叫顺序，数据结构为Json格式<code>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</code>，格式说明：sort是重试号码和未呼叫号码的呼叫顺序 ，type：retryCall重试号码、firstCall未呼叫号码，当type=retryCall，desc：0.优先呼叫待重呼轮次数值较小的号码，即轮次靠前（如第1轮、第2轮）的号码先被呼叫 1.优先呼叫待重呼轮次数值较大的号码，即轮次靠后（如第5轮、第4轮）的号码先被呼叫，当type=firstCall时，orderType：随机呼叫，0顺序(优先级) 1随机 2顺序(导入时间)</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</p>
         */
        @NameInMap("CallPriorityStrategy")
        public String callPriorityStrategy;

        /**
         * <p>呼叫流转模式， 1.直连座席 2.AI转人工 直连座席模式：客户接听后直接分配座席，无空闲座席可溢出语音导航（需配置语音导航），保障高优先级客户直连体验 AI转人工：客户接入后，优先进入语音导航中配置的智能体机器人，按交互结果决定是否转接座席，提升自动化覆盖率，降低人工成本</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallRouteStrategy")
        public Long callRouteStrategy;

        /**
         * <p>座席分配规则，1.随机 2.顺序 3.座席未进线最大时（从上一次呼叫结束到当前的总时长） 4.座席状态[空闲]最长时长（座席最近一次切换为空闲状态的持续时长）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallStrategy")
        public Long callStrategy;

        /**
         * <p>座席通道变量</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
         */
        @NameInMap("CallVariables")
        public String callVariables;

        /**
         * <p>外显规则，Json格式，外显号码选择规则：默认区号，是否匹配省会等；如：{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClidProperty")
        public String clidProperty;

        /**
         * <p>座席工号列表</p>
         * 
         * <strong>example:</strong>
         * <p>1111,2222</p>
         */
        @NameInMap("Cnos")
        public String cnos;

        /**
         * <p>最大并发限制</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Concurrency")
        public Long concurrency;

        /**
         * <p>任务创建时间 ，格式为： yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-12 18:03:14</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>客户侧外显规则，1.随机 2.按区号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomerClidType")
        public Long customerClidType;

        /**
         * <p>外显号码比例配置内容</p>
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
        public Long customerClidWeightFlag;

        /**
         * <p>客户侧外显号码列表</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("CustomerClids")
        public String customerClids;

        /**
         * <p>客户侧外显号码类型，1.外显固话 2.外显手机号  4.外显号码池 5.外显导航</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomerClidsCategory")
        public Long customerClidsCategory;

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
         * <p>17</p>
         */
        @NameInMap("CustomerTimeout")
        public Long customerTimeout;

        /**
         * <p>客户侧提示音</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerVoice")
        public String customerVoice;

        /**
         * <p>任务描述</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>呼叫中心Id</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>定时完成时强制结束任务，开启配置后，当任务到定时完成时间时无论任务中的号码是否已经呼完，均将任务状态设置为结束。适用于对数据有呼叫时间限制的场景。注：任务在结束状态时无法再次启动。 0：否，1：是</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ForceEndFlag")
        public Long forceEndFlag;

        /**
         * <p>外呼任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>暂停后重新预热，0.关闭，1开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsRewarm")
        public Long isRewarm;

        /**
         * <p>语音导航Id，预测外呼使用场景：直连座席模式下如果客户接听后未在特定时间内（默认2秒）找到可用座席，通话将溢出到语音导航继续排队找座席。同时支持在呼转座席，座席未接听时也溢出到语音导航，需要开启企业配置生效。AI转人工模式下，呼叫先转到语音导航 自动外呼使用场景：客户接听后，转到的语音导航</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("IvrId")
        public Long ivrId;

        /**
         * <p>座席最大等待时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("MaxWaitTime")
        public Long maxWaitTime;

        /**
         * <p>最小可用座席数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinAvailableAgentCount")
        public Long minAvailableAgentCount;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>超过呼叫限制的座席</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OverCallLimitCnos")
        public String overCallLimitCnos;

        /**
         * <p>任务结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <p>任务暂停时长(针对自动启动时间段) 单位分钟</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PauseDuration")
        public Long pauseDuration;

        /**
         * <p>任务暂停时间点</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:00:00</p>
         */
        @NameInMap("PauseTime")
        public String pauseTime;

        /**
         * <p>超呼率</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("PredictAdjust")
        public Long predictAdjust;

        /**
         * <p>骚扰率，支持小数，精确到小数点两位</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Quotiety")
        public Double quotiety;

        /**
         * <p>重试策略， 「基础模式」 数据结构为Json格式<code>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</code> 格式说明：retry是重试次数，round是第几次重试，time是第几次重试间隔的时间：1-1-1，第一个1是天，第二个1是小时，第三个1是分钟 「高级模式」 高级模式需要开启「号码状态识别」服务后。目前只支持「自动外呼」任务模式。 数据结构为JsonArray格式 <code>[{&quot;condition&quot;:{&quot;sipCause&quot;:[710,719]},&quot;retry&quot;:1,&quot;sort&quot;:1,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;0-0-10&quot;}]},{&quot;condition&quot;:{&quot;sipCause&quot;:[800]},&quot;retry&quot;:1,&quot;sort&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:2,&quot;time&quot;:&quot;0-0-10&quot;}]}]</code> 格式说明：condition是重试条件，sort是重试条件的顺序，其余字段与基础模式一致</p>
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
         * <p>4</p>
         */
        @NameInMap("RetryStrategyOnlyToday")
        public Long retryStrategyOnlyToday;

        /**
         * <p>重试策略时间类型，1.基于首次呼叫时间 2.基于上次呼叫时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryStrategyTimeType")
        public Long retryStrategyTimeType;

        /**
         * <p>任务开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>任务状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>任务状态变更类型，0.系统变更 1.人为变更</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StatusTriggerType")
        public Long statusTriggerType;

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
        public Long type;

        /**
         * <p>任务自定义字段</p>
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
         * <p>9</p>
         */
        @NameInMap("WarmUpDuration")
        public Long warmUpDuration;

        /**
         * <p>座席整理时间，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Wrapup")
        public Long wrapup;

        public static CloudQueryTaskResponseBodyDataTaskProperties build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryTaskResponseBodyDataTaskProperties self = new CloudQueryTaskResponseBodyDataTaskProperties();
            return TeaModel.build(map, self);
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAgentGroup(String agentGroup) {
            this.agentGroup = agentGroup;
            return this;
        }
        public String getAgentGroup() {
            return this.agentGroup;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAgentTimeout(Long agentTimeout) {
            this.agentTimeout = agentTimeout;
            return this;
        }
        public Long getAgentTimeout() {
            return this.agentTimeout;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAnswerRate(Long answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Long getAnswerRate() {
            return this.answerRate;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoComplete(Long autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public Long getAutoComplete() {
            return this.autoComplete;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStart(Long autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public Long getAutoStart() {
            return this.autoStart;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStartDay(String autoStartDay) {
            this.autoStartDay = autoStartDay;
            return this;
        }
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStartTime(String autoStartTime) {
            this.autoStartTime = autoStartTime;
            return this;
        }
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStop(Long autoStop) {
            this.autoStop = autoStop;
            return this;
        }
        public Long getAutoStop() {
            return this.autoStop;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStopDay(String autoStopDay) {
            this.autoStopDay = autoStopDay;
            return this;
        }
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoStopTime(String autoStopTime) {
            this.autoStopTime = autoStopTime;
            return this;
        }
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoTaskType(Long autoTaskType) {
            this.autoTaskType = autoTaskType;
            return this;
        }
        public Long getAutoTaskType() {
            return this.autoTaskType;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setAutoTriggerTimeStrategy(String autoTriggerTimeStrategy) {
            this.autoTriggerTimeStrategy = autoTriggerTimeStrategy;
            return this;
        }
        public String getAutoTriggerTimeStrategy() {
            return this.autoTriggerTimeStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallGroupType(Long callGroupType) {
            this.callGroupType = callGroupType;
            return this;
        }
        public Long getCallGroupType() {
            return this.callGroupType;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallLimitStrategy(String callLimitStrategy) {
            this.callLimitStrategy = callLimitStrategy;
            return this;
        }
        public String getCallLimitStrategy() {
            return this.callLimitStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallPriorityStrategy(String callPriorityStrategy) {
            this.callPriorityStrategy = callPriorityStrategy;
            return this;
        }
        public String getCallPriorityStrategy() {
            return this.callPriorityStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallRouteStrategy(Long callRouteStrategy) {
            this.callRouteStrategy = callRouteStrategy;
            return this;
        }
        public Long getCallRouteStrategy() {
            return this.callRouteStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallStrategy(Long callStrategy) {
            this.callStrategy = callStrategy;
            return this;
        }
        public Long getCallStrategy() {
            return this.callStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCallVariables(String callVariables) {
            this.callVariables = callVariables;
            return this;
        }
        public String getCallVariables() {
            return this.callVariables;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setClidProperty(String clidProperty) {
            this.clidProperty = clidProperty;
            return this;
        }
        public String getClidProperty() {
            return this.clidProperty;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCnos(String cnos) {
            this.cnos = cnos;
            return this;
        }
        public String getCnos() {
            return this.cnos;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerClidType(Long customerClidType) {
            this.customerClidType = customerClidType;
            return this;
        }
        public Long getCustomerClidType() {
            return this.customerClidType;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerClidWeight(String customerClidWeight) {
            this.customerClidWeight = customerClidWeight;
            return this;
        }
        public String getCustomerClidWeight() {
            return this.customerClidWeight;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerClidWeightFlag(Long customerClidWeightFlag) {
            this.customerClidWeightFlag = customerClidWeightFlag;
            return this;
        }
        public Long getCustomerClidWeightFlag() {
            return this.customerClidWeightFlag;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerClids(String customerClids) {
            this.customerClids = customerClids;
            return this;
        }
        public String getCustomerClids() {
            return this.customerClids;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerClidsCategory(Long customerClidsCategory) {
            this.customerClidsCategory = customerClidsCategory;
            return this;
        }
        public Long getCustomerClidsCategory() {
            return this.customerClidsCategory;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerMoh(String customerMoh) {
            this.customerMoh = customerMoh;
            return this;
        }
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerTimeout(Long customerTimeout) {
            this.customerTimeout = customerTimeout;
            return this;
        }
        public Long getCustomerTimeout() {
            return this.customerTimeout;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setCustomerVoice(String customerVoice) {
            this.customerVoice = customerVoice;
            return this;
        }
        public String getCustomerVoice() {
            return this.customerVoice;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setForceEndFlag(Long forceEndFlag) {
            this.forceEndFlag = forceEndFlag;
            return this;
        }
        public Long getForceEndFlag() {
            return this.forceEndFlag;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setIsRewarm(Long isRewarm) {
            this.isRewarm = isRewarm;
            return this;
        }
        public Long getIsRewarm() {
            return this.isRewarm;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setIvrId(Long ivrId) {
            this.ivrId = ivrId;
            return this;
        }
        public Long getIvrId() {
            return this.ivrId;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setMaxWaitTime(Long maxWaitTime) {
            this.maxWaitTime = maxWaitTime;
            return this;
        }
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setMinAvailableAgentCount(Long minAvailableAgentCount) {
            this.minAvailableAgentCount = minAvailableAgentCount;
            return this;
        }
        public Long getMinAvailableAgentCount() {
            return this.minAvailableAgentCount;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setOverCallLimitCnos(String overCallLimitCnos) {
            this.overCallLimitCnos = overCallLimitCnos;
            return this;
        }
        public String getOverCallLimitCnos() {
            return this.overCallLimitCnos;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setPauseDuration(Long pauseDuration) {
            this.pauseDuration = pauseDuration;
            return this;
        }
        public Long getPauseDuration() {
            return this.pauseDuration;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setPauseTime(String pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }
        public String getPauseTime() {
            return this.pauseTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setPredictAdjust(Long predictAdjust) {
            this.predictAdjust = predictAdjust;
            return this;
        }
        public Long getPredictAdjust() {
            return this.predictAdjust;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setQuotiety(Double quotiety) {
            this.quotiety = quotiety;
            return this;
        }
        public Double getQuotiety() {
            return this.quotiety;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setRetryStrategy(String retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }
        public String getRetryStrategy() {
            return this.retryStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setRetryStrategyOnlyToday(Long retryStrategyOnlyToday) {
            this.retryStrategyOnlyToday = retryStrategyOnlyToday;
            return this;
        }
        public Long getRetryStrategyOnlyToday() {
            return this.retryStrategyOnlyToday;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setRetryStrategyTimeType(Long retryStrategyTimeType) {
            this.retryStrategyTimeType = retryStrategyTimeType;
            return this;
        }
        public Long getRetryStrategyTimeType() {
            return this.retryStrategyTimeType;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setStatusTriggerType(Long statusTriggerType) {
            this.statusTriggerType = statusTriggerType;
            return this;
        }
        public Long getStatusTriggerType() {
            return this.statusTriggerType;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setTimeStrategy(String timeStrategy) {
            this.timeStrategy = timeStrategy;
            return this;
        }
        public String getTimeStrategy() {
            return this.timeStrategy;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setUserFields(String userFields) {
            this.userFields = userFields;
            return this;
        }
        public String getUserFields() {
            return this.userFields;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setWarmUpDuration(Long warmUpDuration) {
            this.warmUpDuration = warmUpDuration;
            return this;
        }
        public Long getWarmUpDuration() {
            return this.warmUpDuration;
        }

        public CloudQueryTaskResponseBodyDataTaskProperties setWrapup(Long wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public Long getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudQueryTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskProperties")
        public java.util.List<CloudQueryTaskResponseBodyDataTaskProperties> taskProperties;

        public static CloudQueryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryTaskResponseBodyData self = new CloudQueryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryTaskResponseBodyData setTaskProperties(java.util.List<CloudQueryTaskResponseBodyDataTaskProperties> taskProperties) {
            this.taskProperties = taskProperties;
            return this;
        }
        public java.util.List<CloudQueryTaskResponseBodyDataTaskProperties> getTaskProperties() {
            return this.taskProperties;
        }

    }

}
