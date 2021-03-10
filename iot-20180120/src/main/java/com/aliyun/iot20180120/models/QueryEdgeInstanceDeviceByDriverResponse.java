// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceDeviceByDriverResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEdgeInstanceDeviceByDriverResponseData data;

    public static QueryEdgeInstanceDeviceByDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceDeviceByDriverResponse self = new QueryEdgeInstanceDeviceByDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceDeviceByDriverResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceDeviceByDriverResponse setData(QueryEdgeInstanceDeviceByDriverResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceDeviceByDriverResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceDeviceByDriverResponseDataDeviceList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static QueryEdgeInstanceDeviceByDriverResponseDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceByDriverResponseDataDeviceList self = new QueryEdgeInstanceDeviceByDriverResponseDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceByDriverResponseDataDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryEdgeInstanceDeviceByDriverResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("DeviceList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceDeviceByDriverResponseDataDeviceList> deviceList;

        public static QueryEdgeInstanceDeviceByDriverResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceDeviceByDriverResponseData self = new QueryEdgeInstanceDeviceByDriverResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceDeviceByDriverResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceDeviceByDriverResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceDeviceByDriverResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceDeviceByDriverResponseData setDeviceList(java.util.List<QueryEdgeInstanceDeviceByDriverResponseDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceDeviceByDriverResponseDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

    }

}
