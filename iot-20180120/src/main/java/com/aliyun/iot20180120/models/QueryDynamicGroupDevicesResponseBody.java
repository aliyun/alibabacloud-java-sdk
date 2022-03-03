// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDynamicGroupDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDynamicGroupDevicesResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NextToken")
    public String nextToken;

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

    public static QueryDynamicGroupDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDynamicGroupDevicesResponseBody self = new QueryDynamicGroupDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDynamicGroupDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDynamicGroupDevicesResponseBody setData(QueryDynamicGroupDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDynamicGroupDevicesResponseBodyData getData() {
        return this.data;
    }

    public QueryDynamicGroupDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDynamicGroupDevicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryDynamicGroupDevicesResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDynamicGroupDevicesResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDynamicGroupDevicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDynamicGroupDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDynamicGroupDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDynamicGroupDevicesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo extends TeaModel {
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("CategoryKey")
        public String categoryKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcActiveTime")
        public String utcActiveTime;

        @NameInMap("UtcLastOnlineTime")
        public String utcLastOnlineTime;

        public static QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo self = new QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setUtcActiveTime(String utcActiveTime) {
            this.utcActiveTime = utcActiveTime;
            return this;
        }
        public String getUtcActiveTime() {
            return this.utcActiveTime;
        }

        public QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo setUtcLastOnlineTime(String utcLastOnlineTime) {
            this.utcLastOnlineTime = utcLastOnlineTime;
            return this;
        }
        public String getUtcLastOnlineTime() {
            return this.utcLastOnlineTime;
        }

    }

    public static class QueryDynamicGroupDevicesResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDynamicGroupDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDynamicGroupDevicesResponseBodyData self = new QueryDynamicGroupDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDynamicGroupDevicesResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDynamicGroupDevicesResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
