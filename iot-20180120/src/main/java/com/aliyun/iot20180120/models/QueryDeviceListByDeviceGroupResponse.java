// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceListByDeviceGroupResponse extends TeaModel {
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
    public QueryDeviceListByDeviceGroupResponseData data;

    public static QueryDeviceListByDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListByDeviceGroupResponse self = new QueryDeviceListByDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListByDeviceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceListByDeviceGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceListByDeviceGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceListByDeviceGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceListByDeviceGroupResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceListByDeviceGroupResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceListByDeviceGroupResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceListByDeviceGroupResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceListByDeviceGroupResponse setData(QueryDeviceListByDeviceGroupResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceListByDeviceGroupResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo extends TeaModel {
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

        public static QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo self = new QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryDeviceListByDeviceGroupResponseData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceListByDeviceGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseData self = new QueryDeviceListByDeviceGroupResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseData setSimpleDeviceInfo(java.util.List<QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceListByDeviceGroupResponseDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
