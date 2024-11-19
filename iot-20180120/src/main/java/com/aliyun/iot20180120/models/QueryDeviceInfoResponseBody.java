// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The alias of the device.</p>
     */
    @NameInMap("Data")
    public QueryDeviceInfoResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the device returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoResponseBody self = new QueryDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceInfoResponseBody setData(QueryDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceInfoResponseBodyData extends TeaModel {
        /**
         * <p>The DeviceSecret of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>mz2Canp4GB7qRVf1OYPNtRqB2anu****</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>detectors_in_beijing</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>a1rYuVF****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static QueryDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceInfoResponseBodyData self = new QueryDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceInfoResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceInfoResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceInfoResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceInfoResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceInfoResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
