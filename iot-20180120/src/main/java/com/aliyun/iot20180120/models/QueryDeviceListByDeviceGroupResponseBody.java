// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceListByDeviceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Data")
    public QueryDeviceListByDeviceGroupResponseBodyData data;

    public static QueryDeviceListByDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListByDeviceGroupResponseBody self = new QueryDeviceListByDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListByDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceListByDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceListByDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceListByDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceListByDeviceGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceListByDeviceGroupResponseBody setData(QueryDeviceListByDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceListByDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo extends TeaModel {
        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo self = new QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryDeviceListByDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceListByDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseBodyData self = new QueryDeviceListByDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
