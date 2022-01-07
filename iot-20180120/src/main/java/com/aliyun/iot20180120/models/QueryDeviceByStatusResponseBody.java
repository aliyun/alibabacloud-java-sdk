// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceByStatusResponseBodyData data;

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

    public static QueryDeviceByStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByStatusResponseBody self = new QueryDeviceByStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceByStatusResponseBody setData(QueryDeviceByStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceByStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceByStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceByStatusResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceByStatusResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceByStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceByStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceByStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceByStatusResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo self = new QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryDeviceByStatusResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceByStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByStatusResponseBodyData self = new QueryDeviceByStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByStatusResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceByStatusResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
