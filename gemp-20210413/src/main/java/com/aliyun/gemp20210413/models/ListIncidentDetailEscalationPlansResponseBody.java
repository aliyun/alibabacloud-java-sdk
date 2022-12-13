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

    public static class ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList extends TeaModel {
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        @NameInMap("noticeObjectName")
        public String noticeObjectName;

        @NameInMap("noticeObjectPhone")
        public String noticeObjectPhone;

        public static ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList self = new ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList setNoticeObjectId(Long noticeObjectId) {
            this.noticeObjectId = noticeObjectId;
            return this;
        }
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList setNoticeObjectName(String noticeObjectName) {
            this.noticeObjectName = noticeObjectName;
            return this;
        }
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList setNoticeObjectPhone(String noticeObjectPhone) {
            this.noticeObjectPhone = noticeObjectPhone;
            return this;
        }
        public String getNoticeObjectPhone() {
            return this.noticeObjectPhone;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList self = new ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan extends TeaModel {
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        @NameInMap("noticeObjectList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        public Long noticeTime;

        @NameInMap("serviceGroupList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList> serviceGroupList;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("status")
        public String status;

        public static ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan self = new ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setEscalationPlanType(String escalationPlanType) {
            this.escalationPlanType = escalationPlanType;
            return this;
        }
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setNoticeChannels(java.util.List<String> noticeChannels) {
            this.noticeChannels = noticeChannels;
            return this;
        }
        public java.util.List<String> getNoticeChannels() {
            return this.noticeChannels;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setNoticeObjectList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList> noticeObjectList) {
            this.noticeObjectList = noticeObjectList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setNoticeTime(Long noticeTime) {
            this.noticeTime = noticeTime;
            return this;
        }
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setServiceGroupList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList> serviceGroupList) {
            this.serviceGroupList = serviceGroupList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlanServiceGroupList> getServiceGroupList() {
            return this.serviceGroupList;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList extends TeaModel {
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        @NameInMap("noticeObjectName")
        public String noticeObjectName;

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

    public static class ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList self = new ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan extends TeaModel {
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        @NameInMap("noticeObjectList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        public Long noticeTime;

        @NameInMap("serviceGroupList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList> serviceGroupList;

        @NameInMap("startTime")
        public Long startTime;

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

        public ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan setServiceGroupList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList> serviceGroupList) {
            this.serviceGroupList = serviceGroupList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlanServiceGroupList> getServiceGroupList() {
            return this.serviceGroupList;
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
        @NameInMap("noticeObjectId")
        public Long noticeObjectId;

        @NameInMap("noticeObjectName")
        public String noticeObjectName;

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

    public static class ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList self = new ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan extends TeaModel {
        @NameInMap("escalationPlanType")
        public String escalationPlanType;

        @NameInMap("noticeChannels")
        public java.util.List<String> noticeChannels;

        @NameInMap("noticeObjectList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanNoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        public Integer noticeTime;

        @NameInMap("serviceGroupList")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList> serviceGroupList;

        @NameInMap("startTime")
        public Long startTime;

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

        public ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan setServiceGroupList(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList> serviceGroupList) {
            this.serviceGroupList = serviceGroupList;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlanServiceGroupList> getServiceGroupList() {
            return this.serviceGroupList;
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
        @NameInMap("convergenceEscalationPlan")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan> convergenceEscalationPlan;

        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        @NameInMap("escalationPlanName")
        public String escalationPlanName;

        @NameInMap("nuAcknowledgeEscalationPlan")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataNuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan;

        @NameInMap("unFinishEscalationPlan")
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataUnFinishEscalationPlan> unFinishEscalationPlan;

        public static ListIncidentDetailEscalationPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentDetailEscalationPlansResponseBodyData self = new ListIncidentDetailEscalationPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentDetailEscalationPlansResponseBodyData setConvergenceEscalationPlan(java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan> convergenceEscalationPlan) {
            this.convergenceEscalationPlan = convergenceEscalationPlan;
            return this;
        }
        public java.util.List<ListIncidentDetailEscalationPlansResponseBodyDataConvergenceEscalationPlan> getConvergenceEscalationPlan() {
            return this.convergenceEscalationPlan;
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
