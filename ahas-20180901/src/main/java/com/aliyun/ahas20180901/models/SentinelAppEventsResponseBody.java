// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelAppEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppEventsResponseBody self = new SentinelAppEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppEventsResponseBody setData(SentinelAppEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelAppEventsResponseBodyData getData() {
        return this.data;
    }

    public SentinelAppEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppEventsResponseBodyDataDatas extends TeaModel {
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

        public static SentinelAppEventsResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsResponseBodyDataDatas self = new SentinelAppEventsResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsResponseBodyDataDatas setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventDetails(String eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public String getEventDetails() {
            return this.eventDetails;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventLevel(Integer eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public Integer getEventLevel() {
            return this.eventLevel;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventMsg(String eventMsg) {
            this.eventMsg = eventMsg;
            return this;
        }
        public String getEventMsg() {
            return this.eventMsg;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public SentinelAppEventsResponseBodyDataDatas setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelAppEventsResponseBodyDataDatas setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelAppEventsResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppEventsResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelAppEventsResponseBodyDataDatas setRuleIds(String ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public String getRuleIds() {
            return this.ruleIds;
        }

        public SentinelAppEventsResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelAppEventsResponseBodyData extends TeaModel {
        @NameInMap("datas")
        public java.util.List<SentinelAppEventsResponseBodyDataDatas> datas;

        @NameInMap("pageIndex")
        public Long pageIndex;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Long totalCount;

        @NameInMap("totalPage")
        public Long totalPage;

        public static SentinelAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsResponseBodyData self = new SentinelAppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsResponseBodyData setDatas(java.util.List<SentinelAppEventsResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelAppEventsResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelAppEventsResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelAppEventsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelAppEventsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelAppEventsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
