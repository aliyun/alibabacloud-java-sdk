// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class QueryInEffectQuthOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryInEffectQuthOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInEffectQuthOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInEffectQuthOrderResponseBody self = new QueryInEffectQuthOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInEffectQuthOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryInEffectQuthOrderResponseBody setData(QueryInEffectQuthOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInEffectQuthOrderResponseBodyData getData() {
        return this.data;
    }

    public QueryInEffectQuthOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInEffectQuthOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInEffectQuthOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS extends TeaModel {
        @NameInMap("AuthitemID")
        public String authitemID;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Name")
        public String name;

        @NameInMap("RemarkDataJson")
        public String remarkDataJson;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Vid")
        public String vid;

        public static QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS build(java.util.Map<String, ?> map) throws Exception {
            QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS self = new QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS();
            return TeaModel.build(map, self);
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setAuthitemID(String authitemID) {
            this.authitemID = authitemID;
            return this;
        }
        public String getAuthitemID() {
            return this.authitemID;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setRemarkDataJson(String remarkDataJson) {
            this.remarkDataJson = remarkDataJson;
            return this;
        }
        public String getRemarkDataJson() {
            return this.remarkDataJson;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

    }

    public static class QueryInEffectQuthOrderResponseBodyDataListOperateTimes extends TeaModel {
        @NameInMap("End")
        public String end;

        @NameInMap("Start")
        public String start;

        public static QueryInEffectQuthOrderResponseBodyDataListOperateTimes build(java.util.Map<String, ?> map) throws Exception {
            QueryInEffectQuthOrderResponseBodyDataListOperateTimes self = new QueryInEffectQuthOrderResponseBodyDataListOperateTimes();
            return TeaModel.build(map, self);
        }

        public QueryInEffectQuthOrderResponseBodyDataListOperateTimes setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public QueryInEffectQuthOrderResponseBodyDataListOperateTimes setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryInEffectQuthOrderResponseBodyDataList extends TeaModel {
        @NameInMap("AuthItemRecordGroupItemDTOS")
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS> authItemRecordGroupItemDTOS;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("OperateTimes")
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataListOperateTimes> operateTimes;

        @NameInMap("OrderVid")
        public String orderVid;

        @NameInMap("Status")
        public Integer status;

        public static QueryInEffectQuthOrderResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryInEffectQuthOrderResponseBodyDataList self = new QueryInEffectQuthOrderResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryInEffectQuthOrderResponseBodyDataList setAuthItemRecordGroupItemDTOS(java.util.List<QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS> authItemRecordGroupItemDTOS) {
            this.authItemRecordGroupItemDTOS = authItemRecordGroupItemDTOS;
            return this;
        }
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataListAuthItemRecordGroupItemDTOS> getAuthItemRecordGroupItemDTOS() {
            return this.authItemRecordGroupItemDTOS;
        }

        public QueryInEffectQuthOrderResponseBodyDataList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryInEffectQuthOrderResponseBodyDataList setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public QueryInEffectQuthOrderResponseBodyDataList setOperateTimes(java.util.List<QueryInEffectQuthOrderResponseBodyDataListOperateTimes> operateTimes) {
            this.operateTimes = operateTimes;
            return this;
        }
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataListOperateTimes> getOperateTimes() {
            return this.operateTimes;
        }

        public QueryInEffectQuthOrderResponseBodyDataList setOrderVid(String orderVid) {
            this.orderVid = orderVid;
            return this;
        }
        public String getOrderVid() {
            return this.orderVid;
        }

        public QueryInEffectQuthOrderResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class QueryInEffectQuthOrderResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("List")
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataList> list;

        public static QueryInEffectQuthOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInEffectQuthOrderResponseBodyData self = new QueryInEffectQuthOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInEffectQuthOrderResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryInEffectQuthOrderResponseBodyData setList(java.util.List<QueryInEffectQuthOrderResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryInEffectQuthOrderResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
