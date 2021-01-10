// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryEventRecordPlanDeviceByPlanResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventRecordPlanDeviceByPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByPlanResponseBody self = new QueryEventRecordPlanDeviceByPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDeviceByPlanResponseBody setData(QueryEventRecordPlanDeviceByPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDeviceByPlanResponseBodyData getData() {
        return this.data;
    }

    public QueryEventRecordPlanDeviceByPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDeviceByPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDeviceByPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventRecordPlanDeviceByPlanResponseBodyDataList extends TeaModel {
        @NameInMap("StreamType")
        public Integer streamType;

        @NameInMap("IotId")
        public String iotId;

        public static QueryEventRecordPlanDeviceByPlanResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByPlanResponseBodyDataList self = new QueryEventRecordPlanDeviceByPlanResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryEventRecordPlanDeviceByPlanResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryEventRecordPlanDeviceByPlanResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("Page")
        public Integer page;

        public static QueryEventRecordPlanDeviceByPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByPlanResponseBodyData self = new QueryEventRecordPlanDeviceByPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyData setList(java.util.List<QueryEventRecordPlanDeviceByPlanResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDeviceByPlanResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryEventRecordPlanDeviceByPlanResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
