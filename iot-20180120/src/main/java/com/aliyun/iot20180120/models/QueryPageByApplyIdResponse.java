// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryPageByApplyIdResponse extends TeaModel {
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

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("ApplyDeviceList")
    @Validation(required = true)
    public QueryPageByApplyIdResponseApplyDeviceList applyDeviceList;

    public static QueryPageByApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPageByApplyIdResponse self = new QueryPageByApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryPageByApplyIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPageByApplyIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPageByApplyIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPageByApplyIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPageByApplyIdResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPageByApplyIdResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPageByApplyIdResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryPageByApplyIdResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryPageByApplyIdResponse setApplyDeviceList(QueryPageByApplyIdResponseApplyDeviceList applyDeviceList) {
        this.applyDeviceList = applyDeviceList;
        return this;
    }
    public QueryPageByApplyIdResponseApplyDeviceList getApplyDeviceList() {
        return this.applyDeviceList;
    }

    public static class QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DeviceSecret")
        @Validation(required = true)
        public String deviceSecret;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo self = new QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryPageByApplyIdResponseApplyDeviceList extends TeaModel {
        @NameInMap("ApplyDeviceInfo")
        @Validation(required = true)
        public java.util.List<QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo> applyDeviceInfo;

        public static QueryPageByApplyIdResponseApplyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseApplyDeviceList self = new QueryPageByApplyIdResponseApplyDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseApplyDeviceList setApplyDeviceInfo(java.util.List<QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo> applyDeviceInfo) {
            this.applyDeviceInfo = applyDeviceInfo;
            return this;
        }
        public java.util.List<QueryPageByApplyIdResponseApplyDeviceListApplyDeviceInfo> getApplyDeviceInfo() {
            return this.applyDeviceInfo;
        }

    }

}
