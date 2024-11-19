// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceListByDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device list information returned if the call succeeds. For more information, see the following <strong>SimpleDeviceInfo</strong> parameter.</p>
     */
    @NameInMap("Data")
    public QueryDeviceListByDeviceGroupResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B1A921D9-1061-4D45-9F12-EA6B0FDEDE30</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of devices.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceListByDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListByDeviceGroupResponseBody self = new QueryDeviceListByDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListByDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceListByDeviceGroupResponseBody setData(QueryDeviceListByDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceListByDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceListByDeviceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceListByDeviceGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceListByDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceListByDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceListByDeviceGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo extends TeaModel {
        /**
         * <p>The name of each device.</p>
         * 
         * <strong>example:</strong>
         * <p>ios_1207_08</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>TfmUAeJjQQhCPH84UVNn0010c6****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1hWjHD****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ProductName of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>WIFIdevice</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo self = new QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryDeviceListByDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceListByDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListByDeviceGroupResponseBodyData self = new QueryDeviceListByDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListByDeviceGroupResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceListByDeviceGroupResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
