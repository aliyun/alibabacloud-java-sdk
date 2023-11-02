// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCustomizeRuleTestResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListCustomizeRuleTestResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCustomizeRuleTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizeRuleTestResultResponseBody self = new ListCustomizeRuleTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomizeRuleTestResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCustomizeRuleTestResultResponseBody setData(ListCustomizeRuleTestResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomizeRuleTestResultResponseBodyData getData() {
        return this.data;
    }

    public ListCustomizeRuleTestResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomizeRuleTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomizeRuleTestResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomizeRuleTestResultResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCustomizeRuleTestResultResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyDataPageInfo self = new ListCustomizeRuleTestResultResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListCustomizeRuleTestResultResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertDesc")
        public String alertDesc;

        @NameInMap("AlertDetail")
        public String alertDetail;

        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        @NameInMap("AttCk")
        public String attCk;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Level")
        public String level;

        @NameInMap("LogSource")
        public String logSource;

        @NameInMap("LogTime")
        public String logTime;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("MainUserId")
        public String mainUserId;

        @NameInMap("OnlineStatus")
        public String onlineStatus;

        @NameInMap("SubUserId")
        public String subUserId;

        @NameInMap("Uuid")
        public String uuid;

        public static ListCustomizeRuleTestResultResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyDataResponseData self = new ListCustomizeRuleTestResultResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setMainUserId(String mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public String getMainUserId() {
            return this.mainUserId;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListCustomizeRuleTestResultResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public ListCustomizeRuleTestResultResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> responseData;

        public static ListCustomizeRuleTestResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyData self = new ListCustomizeRuleTestResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyData setPageInfo(ListCustomizeRuleTestResultResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListCustomizeRuleTestResultResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListCustomizeRuleTestResultResponseBodyData setResponseData(java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
