// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device information returned if the request is successful.</p>
     */
    @NameInMap("Data")
    public ImportDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>A system exception occurred.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDeviceResponseBody self = new ImportDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportDeviceResponseBody setData(ImportDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportDeviceResponseBodyData getData() {
        return this.data;
    }

    public ImportDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ImportDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         * <blockquote>
         * <p> Keep the information confidential.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         * <blockquote>
         * <p> Keep the information confidential.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b4d43f7******10ba5e5</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p> Keep the information confidential.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1O4YPNtRqB2anumz2Canp4GB7*****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
         * <blockquote>
         * <p>If you did not specify an alias for the device, the response parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Campus light</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The SN of the device.</p>
         * <blockquote>
         * <p>If you did not specify an SN for the device, the response parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>QC4******001</p>
         */
        @NameInMap("Sn")
        public String sn;

        public static ImportDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportDeviceResponseBodyData self = new ImportDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ImportDeviceResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public ImportDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ImportDeviceResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public ImportDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ImportDeviceResponseBodyData setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
