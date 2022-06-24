// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppEventsByTypeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelAppEventsByTypeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppEventsByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppEventsByTypeResponseBody self = new SentinelAppEventsByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppEventsByTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppEventsByTypeResponseBody setData(SentinelAppEventsByTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelAppEventsByTypeResponseBodyData getData() {
        return this.data;
    }

    public SentinelAppEventsByTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppEventsByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppEventsByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelAppEventsByTypeResponseBodyDataDatas extends TeaModel {
        @NameInMap("app")
        public String app;

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

        @NameInMap("userId")
        public String userId;

        public static SentinelAppEventsByTypeResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsByTypeResponseBodyDataDatas self = new SentinelAppEventsByTypeResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setEventLevel(Integer eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public Integer getEventLevel() {
            return this.eventLevel;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setEventMsg(String eventMsg) {
            this.eventMsg = eventMsg;
            return this;
        }
        public String getEventMsg() {
            return this.eventMsg;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelAppEventsByTypeResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelAppEventsByTypeResponseBodyData extends TeaModel {
        @NameInMap("datas")
        public java.util.List<SentinelAppEventsByTypeResponseBodyDataDatas> datas;

        @NameInMap("pageIndex")
        public Long pageIndex;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Long totalCount;

        @NameInMap("totalPage")
        public Long totalPage;

        public static SentinelAppEventsByTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsByTypeResponseBodyData self = new SentinelAppEventsByTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsByTypeResponseBodyData setDatas(java.util.List<SentinelAppEventsByTypeResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelAppEventsByTypeResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelAppEventsByTypeResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelAppEventsByTypeResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelAppEventsByTypeResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelAppEventsByTypeResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
