// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryAppDeviceListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

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
    public QueryAppDeviceListResponseData data;

    public static QueryAppDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppDeviceListResponse self = new QueryAppDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppDeviceListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppDeviceListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAppDeviceListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAppDeviceListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppDeviceListResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryAppDeviceListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppDeviceListResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryAppDeviceListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryAppDeviceListResponse setData(QueryAppDeviceListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAppDeviceListResponseData getData() {
        return this.data;
    }

    public static class QueryAppDeviceListResponseDataData extends TeaModel {
        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ActiveTime")
        @Validation(required = true)
        public String activeTime;

        @NameInMap("LastOnlineTime")
        @Validation(required = true)
        public String lastOnlineTime;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ChildDeviceCount")
        @Validation(required = true)
        public Long childDeviceCount;

        @NameInMap("UtcActiveTime")
        @Validation(required = true)
        public String utcActiveTime;

        @NameInMap("UtcLastOnlineTime")
        @Validation(required = true)
        public String utcLastOnlineTime;

        @NameInMap("UtcCreateTime")
        @Validation(required = true)
        public String utcCreateTime;

        public static QueryAppDeviceListResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppDeviceListResponseDataData self = new QueryAppDeviceListResponseDataData();
            return TeaModel.build(map, self);
        }

        public QueryAppDeviceListResponseDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryAppDeviceListResponseDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryAppDeviceListResponseDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryAppDeviceListResponseDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryAppDeviceListResponseDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAppDeviceListResponseDataData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public QueryAppDeviceListResponseDataData setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryAppDeviceListResponseDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAppDeviceListResponseDataData setChildDeviceCount(Long childDeviceCount) {
            this.childDeviceCount = childDeviceCount;
            return this;
        }
        public Long getChildDeviceCount() {
            return this.childDeviceCount;
        }

        public QueryAppDeviceListResponseDataData setUtcActiveTime(String utcActiveTime) {
            this.utcActiveTime = utcActiveTime;
            return this;
        }
        public String getUtcActiveTime() {
            return this.utcActiveTime;
        }

        public QueryAppDeviceListResponseDataData setUtcLastOnlineTime(String utcLastOnlineTime) {
            this.utcLastOnlineTime = utcLastOnlineTime;
            return this;
        }
        public String getUtcLastOnlineTime() {
            return this.utcLastOnlineTime;
        }

        public QueryAppDeviceListResponseDataData setUtcCreateTime(String utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public String getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class QueryAppDeviceListResponseData extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<QueryAppDeviceListResponseDataData> data;

        public static QueryAppDeviceListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppDeviceListResponseData self = new QueryAppDeviceListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAppDeviceListResponseData setData(java.util.List<QueryAppDeviceListResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryAppDeviceListResponseDataData> getData() {
            return this.data;
        }

    }

}
