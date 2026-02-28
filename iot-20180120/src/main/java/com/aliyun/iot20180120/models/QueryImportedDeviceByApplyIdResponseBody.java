// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryImportedDeviceByApplyIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceList")
    public QueryImportedDeviceByApplyIdResponseBodyDeviceList deviceList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static QueryImportedDeviceByApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryImportedDeviceByApplyIdResponseBody self = new QueryImportedDeviceByApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryImportedDeviceByApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryImportedDeviceByApplyIdResponseBody setDeviceList(QueryImportedDeviceByApplyIdResponseBodyDeviceList deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public QueryImportedDeviceByApplyIdResponseBodyDeviceList getDeviceList() {
        return this.deviceList;
    }

    public QueryImportedDeviceByApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryImportedDeviceByApplyIdResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryImportedDeviceByApplyIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryImportedDeviceByApplyIdResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryImportedDeviceByApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryImportedDeviceByApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryImportedDeviceByApplyIdResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Sn")
        public String sn;

        public static QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice build(java.util.Map<String, ?> map) throws Exception {
            QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice self = new QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice();
            return TeaModel.build(map, self);
        }

        public QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class QueryImportedDeviceByApplyIdResponseBodyDeviceList extends TeaModel {
        @NameInMap("device")
        public java.util.List<QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice> device;

        public static QueryImportedDeviceByApplyIdResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryImportedDeviceByApplyIdResponseBodyDeviceList self = new QueryImportedDeviceByApplyIdResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryImportedDeviceByApplyIdResponseBodyDeviceList setDevice(java.util.List<QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice> device) {
            this.device = device;
            return this;
        }
        public java.util.List<QueryImportedDeviceByApplyIdResponseBodyDeviceListDevice> getDevice() {
            return this.device;
        }

    }

}
