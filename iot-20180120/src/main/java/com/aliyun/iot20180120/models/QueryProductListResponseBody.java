// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryProductListResponseBodyData data;

    public static QueryProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponseBody self = new QueryProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductListResponseBody setData(QueryProductListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryProductListResponseBodyDataListProductInfo extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("DataFormat")
        public Integer dataFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("AuthType")
        public String authType;

        public static QueryProductListResponseBodyDataListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataListProductInfo self = new QueryProductListResponseBodyDataListProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataListProductInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProductListResponseBodyDataListProductInfo setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public QueryProductListResponseBodyDataListProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductListResponseBodyDataListProductInfo setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryProductListResponseBodyDataListProductInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryProductListResponseBodyDataListProductInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductListResponseBodyDataListProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductListResponseBodyDataListProductInfo setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

    }

    public static class QueryProductListResponseBodyDataList extends TeaModel {
        @NameInMap("ProductInfo")
        public java.util.List<QueryProductListResponseBodyDataListProductInfo> productInfo;

        public static QueryProductListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataList self = new QueryProductListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataList setProductInfo(java.util.List<QueryProductListResponseBodyDataListProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<QueryProductListResponseBodyDataListProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

    public static class QueryProductListResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("List")
        public QueryProductListResponseBodyDataList list;

        public static QueryProductListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyData self = new QueryProductListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryProductListResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryProductListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryProductListResponseBodyData setList(QueryProductListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryProductListResponseBodyDataList getList() {
            return this.list;
        }

    }

}
