// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceByStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device list information returned if the call succeeds. The <strong>SimpleDeviceInfo</strong> parameter includes the details of the devices.</p>
     */
    @NameInMap("Data")
    public QueryDeviceByStatusResponseBodyData data;

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
     * <p>The total number of devices returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The secret of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>sLefbFmN9SYfnWLJTePG893XNuRV****</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The time when the device was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18 10:46:32</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the device information was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18 10:46:32</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Av8NGHGtwPrH9BYGLMBi00****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>SensorInShanghai</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The status of the device. Valid values:</p>
         * <ul>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>DISABLE</strong>: The device is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the device was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18T02:46:32.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the device information was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18T02:46:32.000Z</p>
         */
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
