// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductListResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product information returned if the call is successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public QueryProductListResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponseBody self = new QueryProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductListResponseBody setData(QueryProductListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductListResponseBodyData getData() {
        return this.data;
    }

    public QueryProductListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryProductListResponseBodyDataListProductInfo extends TeaModel {
        /**
         * <p>The authentication method that was used to connect the devices of the product to IoT Platform. Valid values:</p>
         * <br>
         * <p>*   **secret**: DeviceSecrets were used to authenticate the devices.</p>
         * <p>*   **id2**: IoT Internet Device ID was used to authenticate the devices.</p>
         * <p>*   **x509**: X.509 certificates were used to authenticate the devices.</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The data format that was used by a communication protocol to transmit data between the devices and IoT Platform. This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **0**: custom. A custom serial data format was used. In this case, the device can submit raw data, such as binary data streams. IoT Platform converts the raw data into standard Alink JSON data by using a specified data parsing script.</p>
         * <p>*   **1**: Alink JSON. Alink JSON data is transmitted between the devices and IoT Platform. Alink is a data exchange protocol that is pre-defined by IoT Platform.</p>
         */
        @NameInMap("DataFormat")
        public Integer dataFormat;

        /**
         * <p>The description of the product.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of devices in the product.</p>
         */
        @NameInMap("DeviceCount")
        public Integer deviceCount;

        /**
         * <p>The time when the product was created. The value is a timestamp in milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The node type of the product. This parameter is available only if the AliyunCommodityCode parameter is set to iothub_senior. Valid values:</p>
         * <br>
         * <p>*   **0**: device. Sub-devices cannot be attached to a device. A device can be directly connected to IoT Platform or connected to IoT Platform as a sub-device of a gateway.</p>
         * <p>*   **1**: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain topological relationships with sub-devices, and synchronize topological relationships to IoT Platform.</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The ProductKey of the product. When you create a product, a ProductKey is a globally unique identifier (GUID) that is issued by IoT Platform to the product.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static QueryProductListResponseBodyDataListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductListResponseBodyDataListProductInfo self = new QueryProductListResponseBodyDataListProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductListResponseBodyDataListProductInfo setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
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

        public QueryProductListResponseBodyDataListProductInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The details of the products.</p>
         * <br>
         * <p>>  The returned product information is sorted in reverse-chronological order based on the time when the products were created.</p>
         */
        @NameInMap("List")
        public QueryProductListResponseBodyDataList list;

        /**
         * <p>The total number of returned pages.</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of products.</p>
         */
        @NameInMap("Total")
        public Integer total;

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

        public QueryProductListResponseBodyData setList(QueryProductListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryProductListResponseBodyDataList getList() {
            return this.list;
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

    }

}
