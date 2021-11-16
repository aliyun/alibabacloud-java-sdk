// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailEscalationPlansResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public ListIncidentDetailEscalationPlansResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListIncidentDetailEscalationPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailEscalationPlansResponseBody self = new ListIncidentDetailEscalationPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailEscalationPlansResponseBody setData(ListIncidentDetailEscalationPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIncidentDetailEscalationPlansResponseBodyData getData() {
        return this.data;
    }

    public ListIncidentDetailEscalationPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList extends TeaModel {
        // 分配对象id
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        // 分配对象名称
        @NameInMap("noticeObjectName")
        public String noticeObjectName;

        // 分配对象手机号
        @NameInMap("noticeObjectPhone")
        public String noticeObjectPhone;

        public static ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList self = new ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList setNoticeObjectId(Long noticeObjectId) {
            this.noticeObjectId = noticeObjectId;
            return this;
        }
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList setNoticeObjectName(String noticeObjectName) {
            this.noticeObjectName = noticeObjectName;
            return this;
        }
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList setNoticeObjectPhone(String noticeObjectPhone) {
            this.noticeObjectPhone = noticeObjectPhone;
            return this;
        }
        public String getNoticeObjectPhone() {
            return this.noticeObjectPhone;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan extends TeaModel {
        // 升级策略类型 UN_ACKNOWLEDGE
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        // 分配渠道
        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        // 用户信息
        @NameInMap("noticeObjectList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList;

        // 延迟时间
        @NameInMap("noticeTime")
        public Long noticeTime;

        // 开始时间
        @NameInMap("startTime")
        public Long startTime;

        // 规则触发状态
        @NameInMap("status")
        public String status;

        public static ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan self = new ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setNoticeChannels(java.util.List<String> noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public java.util.List<String> getNoticeChannels() {
            return this.noticeChannels;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setNoticeObjectList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList) {
            this.noticeObjectList = noticeObjectList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList extends TeaModel {
        // 分配对象id
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        // 分配对象名称
        @NameInMap("noticeObjectName")
        public String noticeObjectName;

        // 手机号
        @NameInMap("noticeObjectPhone")
        public String noticeObjectPhone;

        public static ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList self = new ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList setNoticeObjectId(Long noticeObjectId) {
            this.noticeObjectId = noticeObjectId;
            return this;
        }
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList setNoticeObjectName(String noticeObjectName) {
            this.noticeObjectName = noticeObjectName;
            return this;
        }
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList setNoticeObjectPhone(String noticeObjectPhone) {
            this.noticeObjectPhone = noticeObjectPhone;
            return this;
        }
        public String getNoticeObjectPhone() {
            return this.noticeObjectPhone;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan extends TeaModel {
        // 升级策略类型 UN_ACKNOWLEDGE
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        // 分配渠道
        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        // 用户信息
        @NameInMap("noticeObjectList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList> noticeObjectList;

        // 延迟时间
        @NameInMap("noticeTime")
        public Integer noticeTime;

        // 开始时间
        @NameInMap("startTime")
        public Long startTime;

        // 规则触发状态
        @NameInMap("status")
        public String status;

        public static ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan self = new ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setNoticeChannels(java.util.List<String> noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public java.util.List<String> getNoticeChannels() {
            return this.noticeChannels;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setNoticeObjectList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList> noticeObjectList) {
            this.noticeObjectList = noticeObjectList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setNoticeTime(Integer noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Integer getNoticeTime() {
            return this.noticeTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyData extends TeaModel {
        // 升级策略ID
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        // 升级策略名称
        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        // 未响应升级策略
        @NameInMap("nuAcknowledgeEscalationPlan")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan;

        // 未完结升级策略规则列表
        @NameInMap("unFinishEscalationPlan")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan> unFinishEscalationPlan;

        public static ListIncidentDetailEscalationPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyData self = new ListIncidentDetailEscalationPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        public ListIncidentDetailEscalationPlansResponseBodyData setEscalationPlanName(String escalationPlanName) {
            this.escalationPlanName = escalationPlanName;
            return this;
        }
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public ListIncidentDetailEscalationPlansResponseBodyData setNuAcknowledgeEscalationPlan(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan) {
            this.nuAcknowledgeEscalationPlan = nuAcknowledgeEscalationPlan;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan> getNuAcknowledgeEscalationPlan() {
            return this.nuAcknowledgeEscalationPlan;
        }

        public ListIncidentDetailEscalationPlansResponseBodyData setUnFinishEscalationPlan(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan> unFinishEscalationPlan) {
            this.unFinishEscalationPlan = unFinishEscalationPlan;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan> getUnFinishEscalationPlan() {
            return this.unFinishEscalationPlan;
        }

    }

}
