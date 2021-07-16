// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemPreviewResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GetProblemPreviewResponseBodyData data;

    public static GetProblemPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPreviewResponseBody self = new GetProblemPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProblemPreviewResponseBody setData(GetProblemPreviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProblemPreviewResponseBodyData getData() {
        return this.data;
    }

    public static class GetProblemPreviewResponseBodyDataProblemCoordinationGroups extends TeaModel {
        // 服务组名称
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        // 服务Id
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组Maison
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        public static GetProblemPreviewResponseBodyDataProblemCoordinationGroups build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataProblemCoordinationGroups self = new GetProblemPreviewResponseBodyDataProblemCoordinationGroups();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataProblemCoordinationGroups setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public GetProblemPreviewResponseBodyDataProblemCoordinationGroups setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetProblemPreviewResponseBodyDataProblemCoordinationGroups setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

    }

    public static class GetProblemPreviewResponseBodyDataProblemEffectionServices extends TeaModel {
        // 影响服务名称
        @NameInMap("serviceName")
        public String serviceName;

        // 影响服务Id
        @NameInMap("serviceId")
        public Long serviceId;

        public static GetProblemPreviewResponseBodyDataProblemEffectionServices build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataProblemEffectionServices self = new GetProblemPreviewResponseBodyDataProblemEffectionServices();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataProblemEffectionServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetProblemPreviewResponseBodyDataProblemEffectionServices setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

    }

    public static class GetProblemPreviewResponseBodyDataProblem extends TeaModel {
        // 故障名称
        @NameInMap("problemName")
        public String problemName;

        // 故障状态 1 处理中 2已恢复 3复盘中 4已复盘 5已取消
        @NameInMap("problemStatus")
        public String problemStatus;

        // 故障等级 1=P1 2=P2 3=P3 4=P4
        @NameInMap("problemLevel")
        public String problemLevel;

        // 发现时间
        @NameInMap("discoverTime")
        public String discoverTime;

        // 恢复时间
        @NameInMap("recoveryTime")
        public String recoveryTime;

        // 关联服务 名称
        @NameInMap("serviceName")
        public String serviceName;

        // 进展摘要
        @NameInMap("progressSummary")
        public String progressSummary;

        // 初步原因
        @NameInMap("preliminaryReason")
        public String preliminaryReason;

        // 主要处理人
        @NameInMap("mainHandlerName")
        public String mainHandlerName;

        // 主要处理人Id
        @NameInMap("mainHandlerId")
        public String mainHandlerId;

        // 是否手动
        @NameInMap("isManual")
        public Boolean isManual;

        // 是否升级
        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        // 故障Id
        @NameInMap("problemId")
        public Long problemId;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 应急协同组
        @NameInMap("coordinationGroups")
        public java.util.List<GetProblemPreviewResponseBodyDataProblemCoordinationGroups> coordinationGroups;

        // 影响服务
        @NameInMap("effectionServices")
        public java.util.List<GetProblemPreviewResponseBodyDataProblemEffectionServices> effectionServices;

        public static GetProblemPreviewResponseBodyDataProblem build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataProblem self = new GetProblemPreviewResponseBodyDataProblem();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataProblem setProblemName(String problemName) {
            this.problemName = problemName;
            return this;
        }
        public String getProblemName() {
            return this.problemName;
        }

        public GetProblemPreviewResponseBodyDataProblem setProblemStatus(String problemStatus) {
            this.problemStatus = problemStatus;
            return this;
        }
        public String getProblemStatus() {
            return this.problemStatus;
        }

        public GetProblemPreviewResponseBodyDataProblem setProblemLevel(String problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public String getProblemLevel() {
            return this.problemLevel;
        }

        public GetProblemPreviewResponseBodyDataProblem setDiscoverTime(String discoverTime) {
            this.discoverTime = discoverTime;
            return this;
        }
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        public GetProblemPreviewResponseBodyDataProblem setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public GetProblemPreviewResponseBodyDataProblem setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetProblemPreviewResponseBodyDataProblem setProgressSummary(String progressSummary) {
            this.progressSummary = progressSummary;
            return this;
        }
        public String getProgressSummary() {
            return this.progressSummary;
        }

        public GetProblemPreviewResponseBodyDataProblem setPreliminaryReason(String preliminaryReason) {
            this.preliminaryReason = preliminaryReason;
            return this;
        }
        public String getPreliminaryReason() {
            return this.preliminaryReason;
        }

        public GetProblemPreviewResponseBodyDataProblem setMainHandlerName(String mainHandlerName) {
            this.mainHandlerName = mainHandlerName;
            return this;
        }
        public String getMainHandlerName() {
            return this.mainHandlerName;
        }

        public GetProblemPreviewResponseBodyDataProblem setMainHandlerId(String mainHandlerId) {
            this.mainHandlerId = mainHandlerId;
            return this;
        }
        public String getMainHandlerId() {
            return this.mainHandlerId;
        }

        public GetProblemPreviewResponseBodyDataProblem setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public GetProblemPreviewResponseBodyDataProblem setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public GetProblemPreviewResponseBodyDataProblem setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public GetProblemPreviewResponseBodyDataProblem setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetProblemPreviewResponseBodyDataProblem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProblemPreviewResponseBodyDataProblem setCoordinationGroups(java.util.List<GetProblemPreviewResponseBodyDataProblemCoordinationGroups> coordinationGroups) {
            this.coordinationGroups = coordinationGroups;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataProblemCoordinationGroups> getCoordinationGroups() {
            return this.coordinationGroups;
        }

        public GetProblemPreviewResponseBodyDataProblem setEffectionServices(java.util.List<GetProblemPreviewResponseBodyDataProblemEffectionServices> effectionServices) {
            this.effectionServices = effectionServices;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataProblemEffectionServices> getEffectionServices() {
            return this.effectionServices;
        }

    }

    public static class GetProblemPreviewResponseBodyDataVoiceUsers extends TeaModel {
        // 用户
        @NameInMap("username")
        public String username;

        public static GetProblemPreviewResponseBodyDataVoiceUsers build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataVoiceUsers self = new GetProblemPreviewResponseBodyDataVoiceUsers();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataVoiceUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetProblemPreviewResponseBodyDataVoice extends TeaModel {
        // 数量
        @NameInMap("count")
        public Long count;

        @NameInMap("users")
        public java.util.List<GetProblemPreviewResponseBodyDataVoiceUsers> users;

        public static GetProblemPreviewResponseBodyDataVoice build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataVoice self = new GetProblemPreviewResponseBodyDataVoice();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataVoice setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetProblemPreviewResponseBodyDataVoice setUsers(java.util.List<GetProblemPreviewResponseBodyDataVoiceUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataVoiceUsers> getUsers() {
            return this.users;
        }

    }

    public static class GetProblemPreviewResponseBodyDataMailUsers extends TeaModel {
        // 用户名称
        @NameInMap("username")
        public String username;

        public static GetProblemPreviewResponseBodyDataMailUsers build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataMailUsers self = new GetProblemPreviewResponseBodyDataMailUsers();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataMailUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetProblemPreviewResponseBodyDataMail extends TeaModel {
        // 数量
        @NameInMap("count")
        public Long count;

        @NameInMap("users")
        public java.util.List<GetProblemPreviewResponseBodyDataMailUsers> users;

        public static GetProblemPreviewResponseBodyDataMail build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataMail self = new GetProblemPreviewResponseBodyDataMail();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataMail setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetProblemPreviewResponseBodyDataMail setUsers(java.util.List<GetProblemPreviewResponseBodyDataMailUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataMailUsers> getUsers() {
            return this.users;
        }

    }

    public static class GetProblemPreviewResponseBodyDataSmsUsers extends TeaModel {
        // 用户名称
        @NameInMap("username")
        public String username;

        public static GetProblemPreviewResponseBodyDataSmsUsers build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataSmsUsers self = new GetProblemPreviewResponseBodyDataSmsUsers();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataSmsUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetProblemPreviewResponseBodyDataSms extends TeaModel {
        // 数量
        @NameInMap("count")
        public Long count;

        @NameInMap("users")
        public java.util.List<GetProblemPreviewResponseBodyDataSmsUsers> users;

        public static GetProblemPreviewResponseBodyDataSms build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataSms self = new GetProblemPreviewResponseBodyDataSms();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataSms setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetProblemPreviewResponseBodyDataSms setUsers(java.util.List<GetProblemPreviewResponseBodyDataSmsUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataSmsUsers> getUsers() {
            return this.users;
        }

    }

    public static class GetProblemPreviewResponseBodyDataWebhookServiceGroups extends TeaModel {
        // 服务名称
        @NameInMap("serviceName")
        public String serviceName;

        public static GetProblemPreviewResponseBodyDataWebhookServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataWebhookServiceGroups self = new GetProblemPreviewResponseBodyDataWebhookServiceGroups();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataWebhookServiceGroups setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetProblemPreviewResponseBodyDataWebhook extends TeaModel {
        // 数量
        @NameInMap("count")
        public Long count;

        @NameInMap("serviceGroups")
        public java.util.List<GetProblemPreviewResponseBodyDataWebhookServiceGroups> serviceGroups;

        public static GetProblemPreviewResponseBodyDataWebhook build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyDataWebhook self = new GetProblemPreviewResponseBodyDataWebhook();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyDataWebhook setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetProblemPreviewResponseBodyDataWebhook setServiceGroups(java.util.List<GetProblemPreviewResponseBodyDataWebhookServiceGroups> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }
        public java.util.List<GetProblemPreviewResponseBodyDataWebhookServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

    }

    public static class GetProblemPreviewResponseBodyData extends TeaModel {
        @NameInMap("problem")
        public GetProblemPreviewResponseBodyDataProblem problem;

        // 语音
        @NameInMap("voice")
        public GetProblemPreviewResponseBodyDataVoice voice;

        // 邮箱
        @NameInMap("mail")
        public GetProblemPreviewResponseBodyDataMail mail;

        // 短信
        @NameInMap("sms")
        public GetProblemPreviewResponseBodyDataSms sms;

        // webhook
        @NameInMap("webhook")
        public GetProblemPreviewResponseBodyDataWebhook webhook;

        // 升级前数据
        @NameInMap("upBeforeData")
        public String upBeforeData;

        // 升级后数据
        @NameInMap("upAfterData")
        public String upAfterData;

        // 降级前数据
        @NameInMap("deBeforeData")
        public String deBeforeData;

        // 降级后数据
        @NameInMap("deAfterData")
        public String deAfterData;

        public static GetProblemPreviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemPreviewResponseBodyData self = new GetProblemPreviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemPreviewResponseBodyData setProblem(GetProblemPreviewResponseBodyDataProblem problem) {
            this.problem = problem;
            return this;
        }
        public GetProblemPreviewResponseBodyDataProblem getProblem() {
            return this.problem;
        }

        public GetProblemPreviewResponseBodyData setVoice(GetProblemPreviewResponseBodyDataVoice voice) {
            this.voice = voice;
            return this;
        }
        public GetProblemPreviewResponseBodyDataVoice getVoice() {
            return this.voice;
        }

        public GetProblemPreviewResponseBodyData setMail(GetProblemPreviewResponseBodyDataMail mail) {
            this.mail = mail;
            return this;
        }
        public GetProblemPreviewResponseBodyDataMail getMail() {
            return this.mail;
        }

        public GetProblemPreviewResponseBodyData setSms(GetProblemPreviewResponseBodyDataSms sms) {
            this.sms = sms;
            return this;
        }
        public GetProblemPreviewResponseBodyDataSms getSms() {
            return this.sms;
        }

        public GetProblemPreviewResponseBodyData setWebhook(GetProblemPreviewResponseBodyDataWebhook webhook) {
            this.webhook = webhook;
            return this;
        }
        public GetProblemPreviewResponseBodyDataWebhook getWebhook() {
            return this.webhook;
        }

        public GetProblemPreviewResponseBodyData setUpBeforeData(String upBeforeData) {
            this.upBeforeData = upBeforeData;
            return this;
        }
        public String getUpBeforeData() {
            return this.upBeforeData;
        }

        public GetProblemPreviewResponseBodyData setUpAfterData(String upAfterData) {
            this.upAfterData = upAfterData;
            return this;
        }
        public String getUpAfterData() {
            return this.upAfterData;
        }

        public GetProblemPreviewResponseBodyData setDeBeforeData(String deBeforeData) {
            this.deBeforeData = deBeforeData;
            return this;
        }
        public String getDeBeforeData() {
            return this.deBeforeData;
        }

        public GetProblemPreviewResponseBodyData setDeAfterData(String deAfterData) {
            this.deAfterData = deAfterData;
            return this;
        }
        public String getDeAfterData() {
            return this.deAfterData;
        }

    }

}
