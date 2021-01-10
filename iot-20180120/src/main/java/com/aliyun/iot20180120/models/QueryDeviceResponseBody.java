// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Data")
    public QueryDeviceResponseBodyData data;

    public static QueryDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceResponseBody self = new QueryDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceResponseBody setData(QueryDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceResponseBodyDataDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Nickname")
        public String nickname;

        public static QueryDeviceResponseBodyDataDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceResponseBodyDataDeviceInfo self = new QueryDeviceResponseBodyDataDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

    }

    public static class QueryDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceInfo")
        public java.util.List<QueryDeviceResponseBodyDataDeviceInfo> deviceInfo;

        public static QueryDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceResponseBodyData self = new QueryDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceResponseBodyData setDeviceInfo(java.util.List<QueryDeviceResponseBodyDataDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceResponseBodyDataDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

}
