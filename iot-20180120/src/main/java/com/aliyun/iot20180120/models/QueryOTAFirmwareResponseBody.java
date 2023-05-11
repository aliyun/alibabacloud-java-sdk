// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The update package information returned if the call succeeds. For more information, see **FirmwareInfo**.</p>
     */
    @NameInMap("FirmwareInfo")
    public QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo;

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

    public static QueryOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareResponseBody self = new QueryOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAFirmwareResponseBody setFirmwareInfo(QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public QueryOTAFirmwareResponseBodyFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public QueryOTAFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles extends TeaModel {
        /**
         * <p>The MD5 value of the OTA update package file.</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The name of the OTA update package file.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The signature of the OTA update package file.</p>
         */
        @NameInMap("SignValue")
        public String signValue;

        /**
         * <p>The size of the OTA update package file. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The URL of the update package file that is stored in Object Storage Service (OSS).</p>
         */
        @NameInMap("Url")
        public String url;

        public static QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles self = new QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setSignValue(String signValue) {
            this.signValue = signValue;
            return this;
        }
        public String getSignValue() {
            return this.signValue;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryOTAFirmwareResponseBodyFirmwareInfo extends TeaModel {
        /**
         * <p>The version number of the OTA update package.</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The description of the OTA update package.</p>
         */
        @NameInMap("FirmwareDesc")
        public String firmwareDesc;

        /**
         * <p>The unique ID of the OTA update package.</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The name of the OTA update package.</p>
         */
        @NameInMap("FirmwareName")
        public String firmwareName;

        /**
         * <p>The signature of the OTA update package.</p>
         * <br>
         * <p>>  This parameter is available if the OTA update package contains a single file.</p>
         */
        @NameInMap("FirmwareSign")
        public String firmwareSign;

        /**
         * <p>The size of the OTA update package file. Unit: bytes.</p>
         * <br>
         * <p>>  This parameter is available if the OTA update package contains a single file.</p>
         */
        @NameInMap("FirmwareSize")
        public Integer firmwareSize;

        /**
         * <p>The URL of the update package file that is stored in Object Storage Service (OSS).</p>
         * <br>
         * <p>>  This parameter is available if the OTA update package contains a single file.</p>
         */
        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        /**
         * <p>The name of the module.</p>
         * <br>
         * <p>OTA updates are based on the firmware modules of a device. For more information, see [Add a custom OTA module to an update package](~~202664~~).</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The information about the OTA update package files. This parameter is available if the OTA update package contains multiple files.</p>
         */
        @NameInMap("MultiFiles")
        public java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> multiFiles;

        /**
         * <p>The **ProductKey** of the product to which the OTA update package belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the OTA update package belongs.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The signature method of the OTA update package.</p>
         */
        @NameInMap("SignMethod")
        public String signMethod;

        /**
         * <p>The version number of the original update package to be updated.</p>
         * <br>
         * <p>>  This parameter is returned if you perform a delta update. For more information about update package types, see the description of the **Type** parameter.</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <p>The status of the OTA update package. Valid values:</p>
         * <br>
         * <p>*   **-1**: no verification is required</p>
         * <p>*   **0**: unverified</p>
         * <p>*   **1**: verified</p>
         * <p>*   **2**: verifying</p>
         * <p>*   **3**: failed to be verified</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the OTA update package. Valid values:</p>
         * <br>
         * <p>*   **0**: The uploaded file contains a full update package. IoT Platform pushes the full update package to a device for update.</p>
         * <p>*   **1**: The uploaded file contains only the differences between the latest update package and previous update package. IoT Platform pushes only the differences to a device for update.</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The custom information that was pushed to the device. The information can be up to 4,096 characters in length. No limit is applies to the content format.</p>
         * <br>
         * <p>After you add the update package and create an update task, IoT Platform sends the custom information to the specified device when IoT Platform pushes the update notification.</p>
         */
        @NameInMap("Udi")
        public String udi;

        /**
         * <p>The time when the OTA update package was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The verification status of the OTA update package. Valid values:</p>
         * <br>
         * <p>*   **0**: unverified</p>
         * <p>*   **100**: verified</p>
         * <p>*   A value N between 0 and 100 indicates that the update task is N percent completed. You can check the response parameter **Status** to see the verification status.</p>
         */
        @NameInMap("VerifyProgress")
        public Integer verifyProgress;

        public static QueryOTAFirmwareResponseBodyFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseBodyFirmwareInfo self = new QueryOTAFirmwareResponseBodyFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setMultiFiles(java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> multiFiles) {
            this.multiFiles = multiFiles;
            return this;
        }
        public java.util.List<QueryOTAFirmwareResponseBodyFirmwareInfoMultiFiles> getMultiFiles() {
            return this.multiFiles;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUdi(String udi) {
            this.udi = udi;
            return this;
        }
        public String getUdi() {
            return this.udi;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setVerifyProgress(Integer verifyProgress) {
            this.verifyProgress = verifyProgress;
            return this;
        }
        public Integer getVerifyProgress() {
            return this.verifyProgress;
        }

    }

}
