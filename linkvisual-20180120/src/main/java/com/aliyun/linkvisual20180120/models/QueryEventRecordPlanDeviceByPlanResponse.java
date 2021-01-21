// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEventRecordPlanDeviceByPlanResponseData data;

    public static QueryEventRecordPlanDeviceByPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByPlanResponse self = new QueryEventRecordPlanDeviceByPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setData(QueryEventRecordPlanDeviceByPlanResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDeviceByPlanResponseData getData() {
        return this.data;
    }

    public static class QueryEventRecordPlanDeviceByPlanResponseDataList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("StreamType")
        @Validation(required = true)
        public Integer streamType;

        public static QueryEventRecordPlanDeviceByPlanResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByPlanResponseDataList self = new QueryEventRecordPlanDeviceByPlanResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByPlanResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryEventRecordPlanDeviceByPlanResponseDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryEventRecordPlanDeviceByPlanResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryEventRecordPlanDeviceByPlanResponseDataList> list;

        public static QueryEventRecordPlanDeviceByPlanResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByPlanResponseData self = new QueryEventRecordPlanDeviceByPlanResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByPlanResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEventRecordPlanDeviceByPlanResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryEventRecordPlanDeviceByPlanResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryEventRecordPlanDeviceByPlanResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEventRecordPlanDeviceByPlanResponseData setList(java.util.List<QueryEventRecordPlanDeviceByPlanResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDeviceByPlanResponseDataList> getList() {
            return this.list;
        }

    }

}
