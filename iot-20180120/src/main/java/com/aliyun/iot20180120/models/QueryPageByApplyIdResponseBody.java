// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryPageByApplyIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ApplyDeviceList")
    public QueryPageByApplyIdResponseBodyApplyDeviceList applyDeviceList;

    public static QueryPageByApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPageByApplyIdResponseBody self = new QueryPageByApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPageByApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPageByApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPageByApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPageByApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPageByApplyIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPageByApplyIdResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPageByApplyIdResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryPageByApplyIdResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryPageByApplyIdResponseBody setApplyDeviceList(QueryPageByApplyIdResponseBodyApplyDeviceList applyDeviceList) {
        this.applyDeviceList = applyDeviceList;
        return this;
    }
    public QueryPageByApplyIdResponseBodyApplyDeviceList getApplyDeviceList() {
        return this.applyDeviceList;
    }

    public static class QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("IotId")
        public String iotId;

        public static QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo self = new QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryPageByApplyIdResponseBodyApplyDeviceList extends TeaModel {
        @NameInMap("ApplyDeviceInfo")
        public java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> applyDeviceInfo;

        public static QueryPageByApplyIdResponseBodyApplyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseBodyApplyDeviceList self = new QueryPageByApplyIdResponseBodyApplyDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceList setApplyDeviceInfo(java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> applyDeviceInfo) {
            this.applyDeviceInfo = applyDeviceInfo;
            return this;
        }
        public java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> getApplyDeviceInfo() {
            return this.applyDeviceInfo;
        }

    }

}
