// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class BillingStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public BillingStatisticsResponseBodyData data;

    public static BillingStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BillingStatisticsResponseBody self = new BillingStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public BillingStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BillingStatisticsResponseBody setData(BillingStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BillingStatisticsResponseBodyData getData() {
        return this.data;
    }

    public static class BillingStatisticsResponseBodyData extends TeaModel {
        @NameInMap("appUserCount")
        public Long appUserCount;

        @NameInMap("appUserCountFree")
        public Long appUserCountFree;

        @NameInMap("emailSend")
        public Long emailSend;

        @NameInMap("emailSendFree")
        public Long emailSendFree;

        @NameInMap("escalationPlanCount")
        public Long escalationPlanCount;

        @NameInMap("escalationPlanCountFree")
        public Long escalationPlanCountFree;

        @NameInMap("eventReportApi")
        public Long eventReportApi;

        @NameInMap("eventReportApiFree")
        public Long eventReportApiFree;

        @NameInMap("hasScheduleServiceGroupCount")
        public Long hasScheduleServiceGroupCount;

        @NameInMap("hasScheduleServiceGroupCountFree")
        public Long hasScheduleServiceGroupCountFree;

        @NameInMap("imMsgSend")
        public Long imMsgSend;

        @NameInMap("imMsgSendFree")
        public Long imMsgSendFree;

        @NameInMap("ruleCount")
        public Long ruleCount;

        @NameInMap("ruleCountFree")
        public Long ruleCountFree;

        @NameInMap("smsSend")
        public Long smsSend;

        @NameInMap("smsSendFree")
        public Long smsSendFree;

        @NameInMap("subscriptionNotifyCount")
        public Long subscriptionNotifyCount;

        @NameInMap("subscriptionNotifyCountFree")
        public Long subscriptionNotifyCountFree;

        @NameInMap("type")
        public Boolean type;

        @NameInMap("voiceSend")
        public Long voiceSend;

        @NameInMap("voiceSendFree")
        public Long voiceSendFree;

        public static BillingStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BillingStatisticsResponseBodyData self = new BillingStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BillingStatisticsResponseBodyData setAppUserCount(Long appUserCount) {
            this.appUserCount = appUserCount;
            return this;
        }
        public Long getAppUserCount() {
            return this.appUserCount;
        }

        public BillingStatisticsResponseBodyData setAppUserCountFree(Long appUserCountFree) {
            this.appUserCountFree = appUserCountFree;
            return this;
        }
        public Long getAppUserCountFree() {
            return this.appUserCountFree;
        }

        public BillingStatisticsResponseBodyData setEmailSend(Long emailSend) {
            this.emailSend = emailSend;
            return this;
        }
        public Long getEmailSend() {
            return this.emailSend;
        }

        public BillingStatisticsResponseBodyData setEmailSendFree(Long emailSendFree) {
            this.emailSendFree = emailSendFree;
            return this;
        }
        public Long getEmailSendFree() {
            return this.emailSendFree;
        }

        public BillingStatisticsResponseBodyData setEscalationPlanCount(Long escalationPlanCount) {
            this.escalationPlanCount = escalationPlanCount;
            return this;
        }
        public Long getEscalationPlanCount() {
            return this.escalationPlanCount;
        }

        public BillingStatisticsResponseBodyData setEscalationPlanCountFree(Long escalationPlanCountFree) {
            this.escalationPlanCountFree = escalationPlanCountFree;
            return this;
        }
        public Long getEscalationPlanCountFree() {
            return this.escalationPlanCountFree;
        }

        public BillingStatisticsResponseBodyData setEventReportApi(Long eventReportApi) {
            this.eventReportApi = eventReportApi;
            return this;
        }
        public Long getEventReportApi() {
            return this.eventReportApi;
        }

        public BillingStatisticsResponseBodyData setEventReportApiFree(Long eventReportApiFree) {
            this.eventReportApiFree = eventReportApiFree;
            return this;
        }
        public Long getEventReportApiFree() {
            return this.eventReportApiFree;
        }

        public BillingStatisticsResponseBodyData setHasScheduleServiceGroupCount(Long hasScheduleServiceGroupCount) {
            this.hasScheduleServiceGroupCount = hasScheduleServiceGroupCount;
            return this;
        }
        public Long getHasScheduleServiceGroupCount() {
            return this.hasScheduleServiceGroupCount;
        }

        public BillingStatisticsResponseBodyData setHasScheduleServiceGroupCountFree(Long hasScheduleServiceGroupCountFree) {
            this.hasScheduleServiceGroupCountFree = hasScheduleServiceGroupCountFree;
            return this;
        }
        public Long getHasScheduleServiceGroupCountFree() {
            return this.hasScheduleServiceGroupCountFree;
        }

        public BillingStatisticsResponseBodyData setImMsgSend(Long imMsgSend) {
            this.imMsgSend = imMsgSend;
            return this;
        }
        public Long getImMsgSend() {
            return this.imMsgSend;
        }

        public BillingStatisticsResponseBodyData setImMsgSendFree(Long imMsgSendFree) {
            this.imMsgSendFree = imMsgSendFree;
            return this;
        }
        public Long getImMsgSendFree() {
            return this.imMsgSendFree;
        }

        public BillingStatisticsResponseBodyData setRuleCount(Long ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public BillingStatisticsResponseBodyData setRuleCountFree(Long ruleCountFree) {
            this.ruleCountFree = ruleCountFree;
            return this;
        }
        public Long getRuleCountFree() {
            return this.ruleCountFree;
        }

        public BillingStatisticsResponseBodyData setSmsSend(Long smsSend) {
            this.smsSend = smsSend;
            return this;
        }
        public Long getSmsSend() {
            return this.smsSend;
        }

        public BillingStatisticsResponseBodyData setSmsSendFree(Long smsSendFree) {
            this.smsSendFree = smsSendFree;
            return this;
        }
        public Long getSmsSendFree() {
            return this.smsSendFree;
        }

        public BillingStatisticsResponseBodyData setSubscriptionNotifyCount(Long subscriptionNotifyCount) {
            this.subscriptionNotifyCount = subscriptionNotifyCount;
            return this;
        }
        public Long getSubscriptionNotifyCount() {
            return this.subscriptionNotifyCount;
        }

        public BillingStatisticsResponseBodyData setSubscriptionNotifyCountFree(Long subscriptionNotifyCountFree) {
            this.subscriptionNotifyCountFree = subscriptionNotifyCountFree;
            return this;
        }
        public Long getSubscriptionNotifyCountFree() {
            return this.subscriptionNotifyCountFree;
        }

        public BillingStatisticsResponseBodyData setType(Boolean type) {
            this.type = type;
            return this;
        }
        public Boolean getType() {
            return this.type;
        }

        public BillingStatisticsResponseBodyData setVoiceSend(Long voiceSend) {
            this.voiceSend = voiceSend;
            return this;
        }
        public Long getVoiceSend() {
            return this.voiceSend;
        }

        public BillingStatisticsResponseBodyData setVoiceSendFree(Long voiceSendFree) {
            this.voiceSendFree = voiceSendFree;
            return this;
        }
        public Long getVoiceSendFree() {
            return this.voiceSendFree;
        }

    }

}
