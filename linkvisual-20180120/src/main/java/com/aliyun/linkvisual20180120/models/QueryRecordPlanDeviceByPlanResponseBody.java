// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecordPlanDeviceByPlanResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordPlanDeviceByPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByPlanResponseBody self = new QueryRecordPlanDeviceByPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDeviceByPlanResponseBody setData(QueryRecordPlanDeviceByPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDeviceByPlanResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordPlanDeviceByPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDeviceByPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDeviceByPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordPlanDeviceByPlanResponseBodyDataList extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("StreamType")
        public Integer streamType;

        public static QueryRecordPlanDeviceByPlanResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByPlanResponseBodyDataList self = new QueryRecordPlanDeviceByPlanResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByPlanResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryRecordPlanDeviceByPlanResponseBodyDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryRecordPlanDeviceByPlanResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryRecordPlanDeviceByPlanResponseBodyDataList> list;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryRecordPlanDeviceByPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByPlanResponseBodyData self = new QueryRecordPlanDeviceByPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByPlanResponseBodyData setList(java.util.List<QueryRecordPlanDeviceByPlanResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordPlanDeviceByPlanResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryRecordPlanDeviceByPlanResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRecordPlanDeviceByPlanResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryRecordPlanDeviceByPlanResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordPlanDeviceByPlanResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
