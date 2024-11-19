// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned if the call is successful. The details of the devices are included in the <strong>DeviceInfo</strong> parameter.</p>
     * <blockquote>
     * <p> The returned device information is sorted in reverse chronological order based on the time when the devices were created.</p>
     * </blockquote>
     */
    @NameInMap("Data")
    public QueryDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The token that is used to retrieve the subsequent page of the query results. You can specify this parameter in the subsequent query to obtain the next page of results.</p>
     * <p>If the <strong>NextToken</strong> parameter is empty, no subsequent page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The total number of pages returned.</p>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
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
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceResponseBody self = new QueryDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceResponseBody setData(QueryDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryDeviceResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceResponseBodyDataDeviceInfo extends TeaModel {
        /**
         * <p>The ID of the device.</p>
         * <blockquote>
         * <p> This parameter is deprecated. Do not use this parameter to identify a device. You can use the <strong>IotId</strong> parameter or a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters to identify a device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dwnS41bhNxjslDAI****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>sLefbFmN9SYfnWLJTePG893XNuRV****</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The status of the device. Valid values:</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is deactivated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>The category of the product to which the device belongs.</p>
         * <blockquote>
         * <p> This parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Lighting</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the device was created. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>Wed, 20-Feb-2019 02:16:09 GMT</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the device information was last updated. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>Wed, 20-Feb-2019 02:16:09 GMT</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
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
         * <p>The time when the device was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T02:16:09.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the device information was last updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-20T02:16:09.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryDeviceResponseBodyDataDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceResponseBodyDataDeviceInfo self = new QueryDeviceResponseBodyDataDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceResponseBodyDataDeviceInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceInfo")
        public java.util.List<QueryDeviceResponseBodyDataDeviceInfo> deviceInfo;

        public static QueryDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceResponseBodyData self = new QueryDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceResponseBodyData setDeviceInfo(java.util.List<QueryDeviceResponseBodyDataDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceResponseBodyDataDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

}
