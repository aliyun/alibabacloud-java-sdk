// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryPageByApplyIdResponseBody extends TeaModel {
    /**
     * <p>The registered device list information returned if the call succeeds. The **ApplyDeviceInfo** parameter includes the details of the registered devices.</p>
     */
    @NameInMap("ApplyDeviceList")
    public QueryPageByApplyIdResponseBodyApplyDeviceList applyDeviceList;

    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](/help/en/iot-platform/latest/bce100).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The total number of pages.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <p>The total number of devices.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryPageByApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPageByApplyIdResponseBody self = new QueryPageByApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPageByApplyIdResponseBody setApplyDeviceList(QueryPageByApplyIdResponseBodyApplyDeviceList applyDeviceList) {
        this.applyDeviceList = applyDeviceList;
        return this;
    }
    public QueryPageByApplyIdResponseBodyApplyDeviceList getApplyDeviceList() {
        return this.applyDeviceList;
    }

    public QueryPageByApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPageByApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPageByApplyIdResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPageByApplyIdResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryPageByApplyIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPageByApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPageByApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPageByApplyIdResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo extends TeaModel {
        /**
         * <p>The ID of the device (expired).</p>
         * <br>
         * <p>>  This parameter is no longer used. Do not use this parameter to identify a device. You can use the **IotId** parameter or a combination of the **ProductKey** and **DeviceName** parameters to identify a device.</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        public static QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo self = new QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryPageByApplyIdResponseBodyApplyDeviceList extends TeaModel {
        @NameInMap("ApplyDeviceInfo")
        public java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> applyDeviceInfo;

        public static QueryPageByApplyIdResponseBodyApplyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryPageByApplyIdResponseBodyApplyDeviceList self = new QueryPageByApplyIdResponseBodyApplyDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryPageByApplyIdResponseBodyApplyDeviceList setApplyDeviceInfo(java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> applyDeviceInfo) {
            this.applyDeviceInfo = applyDeviceInfo;
            return this;
        }
        public java.util.List<QueryPageByApplyIdResponseBodyApplyDeviceListApplyDeviceInfo> getApplyDeviceInfo() {
            return this.applyDeviceInfo;
        }

    }

}
