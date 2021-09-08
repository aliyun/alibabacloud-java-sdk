// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByTagsResponse extends TeaModel {
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

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceByTagsResponseData data;

    public static QueryDeviceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByTagsResponse self = new QueryDeviceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceByTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceByTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceByTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceByTagsResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceByTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceByTagsResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceByTagsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceByTagsResponse setData(QueryDeviceByTagsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceByTagsResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceByTagsResponseDataSimpleDeviceInfo extends TeaModel {
        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static QueryDeviceByTagsResponseDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseDataSimpleDeviceInfo self = new QueryDeviceByTagsResponseDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceByTagsResponseDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceByTagsResponseDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceByTagsResponseDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryDeviceByTagsResponseData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceByTagsResponseDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceByTagsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseData self = new QueryDeviceByTagsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseData setSimpleDeviceInfo(java.util.List<QueryDeviceByTagsResponseDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceByTagsResponseDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
