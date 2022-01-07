// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByTagsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceByTagsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByTagsResponseBody self = new QueryDeviceByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceByTagsResponseBody setData(QueryDeviceByTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceByTagsResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceByTagsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceByTagsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceByTagsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        public static QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo self = new QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryDeviceByTagsResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceByTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseBodyData self = new QueryDeviceByTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
