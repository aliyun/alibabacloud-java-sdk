// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppResourceEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelAppResourceEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppResourceEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppResourceEventsResponseBody self = new SentinelAppResourceEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppResourceEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppResourceEventsResponseBody setData(SentinelAppResourceEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelAppResourceEventsResponseBodyData getData() {
        return this.data;
    }

    public SentinelAppResourceEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppResourceEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppResourceEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppResourceEventsResponseBodyDataDatas extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("eventDetails")
        public String eventDetails;

        @NameInMap("eventLevel")
        public Integer eventLevel;

        @NameInMap("eventMsg")
        public String eventMsg;

        @NameInMap("eventType")
        public Integer eventType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("ruleIds")
        public String ruleIds;

        @NameInMap("userId")
        public String userId;

        public static SentinelAppResourceEventsResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppResourceEventsResponseBodyDataDatas self = new SentinelAppResourceEventsResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setEventDetails(String eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public String getEventDetails() {
            return this.eventDetails;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setEventLevel(Integer eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public Integer getEventLevel() {
            return this.eventLevel;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setEventMsg(String eventMsg) {
            this.eventMsg = eventMsg;
            return this;
        }
        public String getEventMsg() {
            return this.eventMsg;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setRuleIds(String ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public String getRuleIds() {
            return this.ruleIds;
        }

        public SentinelAppResourceEventsResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelAppResourceEventsResponseBodyData extends TeaModel {
        @NameInMap("datas")
        public java.util.List<SentinelAppResourceEventsResponseBodyDataDatas> datas;

        @NameInMap("pageIndex")
        public Long pageIndex;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Long totalCount;

        @NameInMap("totalPage")
        public Long totalPage;

        public static SentinelAppResourceEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppResourceEventsResponseBodyData self = new SentinelAppResourceEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppResourceEventsResponseBodyData setDatas(java.util.List<SentinelAppResourceEventsResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelAppResourceEventsResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelAppResourceEventsResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelAppResourceEventsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelAppResourceEventsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelAppResourceEventsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
