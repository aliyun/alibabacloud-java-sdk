// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByPlanResponse extends TeaModel {
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
    public QueryRecordPlanDeviceByPlanResponseData data;

    public static QueryRecordPlanDeviceByPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByPlanResponse self = new QueryRecordPlanDeviceByPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDeviceByPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordPlanDeviceByPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDeviceByPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDeviceByPlanResponse setData(QueryRecordPlanDeviceByPlanResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDeviceByPlanResponseData getData() {
        return this.data;
    }

    public static class QueryRecordPlanDeviceByPlanResponseDataList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("StreamType")
        @Validation(required = true)
        public Integer streamType;

        public static QueryRecordPlanDeviceByPlanResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByPlanResponseDataList self = new QueryRecordPlanDeviceByPlanResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByPlanResponseDataList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryRecordPlanDeviceByPlanResponseDataList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

    }

    public static class QueryRecordPlanDeviceByPlanResponseData extends TeaModel {
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
        public java.util.List<QueryRecordPlanDeviceByPlanResponseDataList> list;

        public static QueryRecordPlanDeviceByPlanResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByPlanResponseData self = new QueryRecordPlanDeviceByPlanResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByPlanResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryRecordPlanDeviceByPlanResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryRecordPlanDeviceByPlanResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRecordPlanDeviceByPlanResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordPlanDeviceByPlanResponseData setList(java.util.List<QueryRecordPlanDeviceByPlanResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordPlanDeviceByPlanResponseDataList> getList() {
            return this.list;
        }

    }

}
