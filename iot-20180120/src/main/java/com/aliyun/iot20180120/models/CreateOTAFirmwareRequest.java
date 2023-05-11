// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareRequest extends TeaModel {
    /**
     * <p>The version number of the OTA update package. The value can contain letters, digits, periods (.), hyphens (-), and underscores (\_). The version number must be 1 to 64 characters in length.</p>
     */
    @NameInMap("DestVersion")
    public String destVersion;

    /**
     * <p>The description of the OTA update package. The description must be 1 to 100 characters in length.</p>
     */
    @NameInMap("FirmwareDesc")
    public String firmwareDesc;

    /**
     * <p>The name of the OTA update package. The name must be unique within an Alibaba Cloud account. The name cannot be modified after the OTA update package is created. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), underscores (\_), and parentheses (). The name must start with a letter or a digit.</p>
     */
    @NameInMap("FirmwareName")
    public String firmwareName;

    /**
     * <p>The signature of the OTA update package. The value is calculated by using the specified **signature algorithm** to sign the OTA update package.</p>
     * <br>
     * <p>> If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the OTA update package in OSS is used as the package signature.</p>
     */
    @NameInMap("FirmwareSign")
    public String firmwareSign;

    /**
     * <p>The size of the OTA update package. Unit: bytes.</p>
     * <br>
     * <p>> If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the OTA update package in OSS is used.</p>
     */
    @NameInMap("FirmwareSize")
    public Integer firmwareSize;

    /**
     * <p>The URL of the OTA update package. This parameter specifies the storage location of the OTA update package in OSS. You can call the [GenerateOTAUploadURL](~~147310~~) operation to generate a URL for the OTA update package.</p>
     * <br>
     * <p>>If you add only one file to the OTA update package, you must configure this parameter.</p>
     */
    @NameInMap("FirmwareUrl")
    public String firmwareUrl;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module. OTA modules are the updatable units of devices that belong to the same product.</p>
     * <br>
     * <p>> *   If you do not configure this parameter, the default OTA module is used. The default value indicates that the complete device firmware is updated.</p>
     * <p>>*   You can call the [CreateOTAModule](~~186066~~) operation to create a custom OTA module. You can call the [ListOTAModuleByProduct](~~186532~~) operation to query the existing OTA modules of a product.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("MultiFiles")
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles;

    /**
     * <p>Specifies whether to verify the OTA update package before you create a batch update task.</p>
     * <br>
     * <p>*   **true** The system verifies the OTA update package before you create a batch update task. This is the default value.</p>
     * <p>*   **false**: The system does not verify the OTA update package before you create a batch update task.</p>
     */
    @NameInMap("NeedToVerify")
    public Boolean needToVerify;

    /**
     * <p>The **ProductKey** of the product to which the OTA update package belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The signature algorithm of the OTA update package. Set the value to **MD5**. The value indicates an MD5 signature.</p>
     * <br>
     * <p>Default value: **MD5**.</p>
     */
    @NameInMap("SignMethod")
    public String signMethod;

    /**
     * <p>The version number of the OTA module of the device to be updated.</p>
     * <br>
     * <p>You can call the [QueryDeviceDetail](~~69594~~) operation and view the **FirmwareVersion** parameter in the response.</p>
     * <br>
     * <p>> *   If you set the **Type** parameter to **1**, you must configure this parameter, and the value cannot be the same as the update package version that is specified by the **DestVersion** parameter.</p>
     * <p>>*   If you set the **Type** parameter to **0**, this parameter is optional.</p>
     */
    @NameInMap("SrcVersion")
    public String srcVersion;

    /**
     * <p>The type of the OTA update package. Valid values:</p>
     * <br>
     * <p>*   **0**: The uploaded file contains a full update package. IoT Platform pushes the full update package to a device for update.</p>
     * <p>*   **1**: The uploaded file contains only the differences between the latest update package and the previous update package. IoT Platform pushes only the differences to a device for update.</p>
     * <br>
     * <p>Default value: **0**.</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The custom information that you want to send to a device. The format of the custom information has no limits. However, the information cannot exceed 4,096 characters in length.</p>
     * <br>
     * <p>After you add the OTA update package and create an update task, IoT Platform sends the custom information to the specified device when IoT Platform pushes an update notification.</p>
     */
    @NameInMap("Udi")
    public String udi;

    public static CreateOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAFirmwareRequest self = new CreateOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAFirmwareRequest setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public CreateOTAFirmwareRequest setFirmwareDesc(String firmwareDesc) {
        this.firmwareDesc = firmwareDesc;
        return this;
    }
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    public CreateOTAFirmwareRequest setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }
    public String getFirmwareName() {
        return this.firmwareName;
    }

    public CreateOTAFirmwareRequest setFirmwareSign(String firmwareSign) {
        this.firmwareSign = firmwareSign;
        return this;
    }
    public String getFirmwareSign() {
        return this.firmwareSign;
    }

    public CreateOTAFirmwareRequest setFirmwareSize(Integer firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }
    public Integer getFirmwareSize() {
        return this.firmwareSize;
    }

    public CreateOTAFirmwareRequest setFirmwareUrl(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }
    public String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    public CreateOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAFirmwareRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateOTAFirmwareRequest setMultiFiles(java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles) {
        this.multiFiles = multiFiles;
        return this;
    }
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> getMultiFiles() {
        return this.multiFiles;
    }

    public CreateOTAFirmwareRequest setNeedToVerify(Boolean needToVerify) {
        this.needToVerify = needToVerify;
        return this;
    }
    public Boolean getNeedToVerify() {
        return this.needToVerify;
    }

    public CreateOTAFirmwareRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTAFirmwareRequest setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }
    public String getSignMethod() {
        return this.signMethod;
    }

    public CreateOTAFirmwareRequest setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTAFirmwareRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateOTAFirmwareRequest setUdi(String udi) {
        this.udi = udi;
        return this;
    }
    public String getUdi() {
        return this.udi;
    }

    public static class CreateOTAFirmwareRequestMultiFiles extends TeaModel {
        /**
         * <p>The MD5 value of the file.</p>
         * <br>
         * <p>>  If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used.</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The name of the file in the update package. The name must be 1 to 32 characters in length. You can specify up to 20 file names. Each name must be unique in the OTA update package.</p>
         * <br>
         * <p>> If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The signature of the file. The value is calculated by using the specified **signature algorithm** to sign the file.</p>
         * <br>
         * <p>>  If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used as the file signature.</p>
         */
        @NameInMap("SignValue")
        public String signValue;

        /**
         * <p>The size of the file in the OTA update package. Unit: bytes.</p>
         * <br>
         * <p>>  If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the file in OSS is used.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The URL of the file. This parameter specifies the storage location of the file in OSS. You can call the [GenerateOTAUploadURL](~~147310~~) operation to generate a URL for each file in the OTA update package.</p>
         * <br>
         * <p>> If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateOTAFirmwareRequestMultiFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAFirmwareRequestMultiFiles self = new CreateOTAFirmwareRequestMultiFiles();
            return TeaModel.build(map, self);
        }

        public CreateOTAFirmwareRequestMultiFiles setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public CreateOTAFirmwareRequestMultiFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOTAFirmwareRequestMultiFiles setSignValue(String signValue) {
            this.signValue = signValue;
            return this;
        }
        public String getSignValue() {
            return this.signValue;
        }

        public CreateOTAFirmwareRequestMultiFiles setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateOTAFirmwareRequestMultiFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
