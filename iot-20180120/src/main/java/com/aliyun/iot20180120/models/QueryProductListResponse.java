// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductListResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public QueryProductListResponseData data;

    public static QueryProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponse self = new QueryProductListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductListResponse setData(QueryProductListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseData getData() {
        return this.data;
    }

    public static class QueryProductListResponseDataListProductInfo extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("DataFormat")
        @Validation(required = true)
        public Integer dataFormat;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Integer deviceCount;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("AuthType")
        @Validation(required = true)
        public String authType;

        public static QueryProductListResponseDataListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseDataListProductInfo self = new QueryProductListResponseDataListProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseDataListProductInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryProductListResponseDataListProductInfo setDataFormat(Integer dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Integer getDataFormat() {
            return this.dataFormat;
        }

        public QueryProductListResponseDataListProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductListResponseDataListProductInfo setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public QueryProductListResponseDataListProductInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryProductListResponseDataListProductInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductListResponseDataListProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductListResponseDataListProductInfo setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

    }

    public static class QueryProductListResponseDataList extends TeaModel {
        @NameInMap("ProductInfo")
        @Validation(required = true)
        public java.util.List<QueryProductListResponseDataListProductInfo> productInfo;

        public static QueryProductListResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseDataList self = new QueryProductListResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseDataList setProductInfo(java.util.List<QueryProductListResponseDataListProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<QueryProductListResponseDataListProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

    public static class QueryProductListResponseData extends TeaModel {
        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("List")
        @Validation(required = true)
        public QueryProductListResponseDataList list;

        public static QueryProductListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseData self = new QueryProductListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryProductListResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryProductListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductListResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryProductListResponseData setList(QueryProductListResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryProductListResponseDataList getList() {
            return this.list;
        }

    }

}
