// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryAppDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppDeviceListResponseBodyData data;

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

    public static QueryAppDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppDeviceListResponseBody self = new QueryAppDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppDeviceListResponseBody setData(QueryAppDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryAppDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAppDeviceListResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryAppDeviceListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryAppDeviceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAppDeviceListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryAppDeviceListResponseBodyDataData extends TeaModel {
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("ChildDeviceCount")
        public Long childDeviceCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

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

        @NameInMap("UtcCreateTime")
        public String utcCreateTime;

        @NameInMap("UtcLastOnlineTime")
        public String utcLastOnlineTime;

        public static QueryAppDeviceListResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppDeviceListResponseBodyDataData self = new QueryAppDeviceListResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryAppDeviceListResponseBodyDataData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryAppDeviceListResponseBodyDataData setChildDeviceCount(Long childDeviceCount) {
            this.childDeviceCount = childDeviceCount;
            return this;
        }
        public Long getChildDeviceCount() {
            return this.childDeviceCount;
        }

        public QueryAppDeviceListResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAppDeviceListResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryAppDeviceListResponseBodyDataData setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryAppDeviceListResponseBodyDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryAppDeviceListResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryAppDeviceListResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryAppDeviceListResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAppDeviceListResponseBodyDataData setUtcActiveTime(String utcActiveTime) {
            this.utcActiveTime = utcActiveTime;
            return this;
        }
        public String getUtcActiveTime() {
            return this.utcActiveTime;
        }

        public QueryAppDeviceListResponseBodyDataData setUtcCreateTime(String utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public String getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public QueryAppDeviceListResponseBodyDataData setUtcLastOnlineTime(String utcLastOnlineTime) {
            this.utcLastOnlineTime = utcLastOnlineTime;
            return this;
        }
        public String getUtcLastOnlineTime() {
            return this.utcLastOnlineTime;
        }

    }

    public static class QueryAppDeviceListResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryAppDeviceListResponseBodyDataData> data;

        public static QueryAppDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppDeviceListResponseBodyData self = new QueryAppDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppDeviceListResponseBodyData setData(java.util.List<QueryAppDeviceListResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryAppDeviceListResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
