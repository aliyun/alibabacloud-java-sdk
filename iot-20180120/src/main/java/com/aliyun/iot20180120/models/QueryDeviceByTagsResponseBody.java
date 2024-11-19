// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned if the call succeeds. The <strong>SimpleDeviceInfo</strong> parameter includes the details of the devices.</p>
     */
    @NameInMap("Data")
    public QueryDeviceByTagsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number of the returned page.</p>
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
     * <p>The number of entries returned on each page.</p>
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
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
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
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceByTagsResponseBody self = new QueryDeviceByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceByTagsResponseBody setData(QueryDeviceByTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceByTagsResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceByTagsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceByTagsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceByTagsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light1</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>lamp</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo self = new QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryDeviceByTagsResponseBodyData extends TeaModel {
        @NameInMap("SimpleDeviceInfo")
        public java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo;

        public static QueryDeviceByTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceByTagsResponseBodyData self = new QueryDeviceByTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceByTagsResponseBodyData setSimpleDeviceInfo(java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> simpleDeviceInfo) {
            this.simpleDeviceInfo = simpleDeviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceByTagsResponseBodyDataSimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

    }

}
