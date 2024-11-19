// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareRequest extends TeaModel {
    /**
     * <p>The version number of the OTA update package. The value can contain letters, digits, periods (.), hyphens (-), and underscores (_). The version number must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("DestVersion")
    public String destVersion;

    /**
     * <p>The description of the OTA update package. The description must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>OTA function updated</p>
     */
    @NameInMap("FirmwareDesc")
    public String firmwareDesc;

    /**
     * <p>The name of the OTA update package. The name must be unique within an Alibaba Cloud account. The name cannot be modified after the OTA update package is created. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), underscores (_), and parentheses (). The name must start with a letter or a digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Firmware2</p>
     */
    @NameInMap("FirmwareName")
    public String firmwareName;

    /**
     * <p>The signature of the OTA update package. The value is calculated by using the specified <strong>signature algorithm</strong> to sign the OTA update package.</p>
     * <blockquote>
     * <p>If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the OTA update package in OSS is used as the package signature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>93230c3bde425a9d7984a594ac55****</p>
     */
    @NameInMap("FirmwareSign")
    public String firmwareSign;

    /**
     * <p>The size of the OTA update package. Unit: bytes.</p>
     * <blockquote>
     * <p>If you add only one file to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the OTA update package in OSS is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("FirmwareSize")
    public Integer firmwareSize;

    /**
     * <p>The URL of the OTA update package. This parameter specifies the storage location of the OTA update package in OSS. You can call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate a URL for the OTA update package.</p>
     * <blockquote>
     * <p>If you add only one file to the OTA update package, you must configure this parameter.</p>
     * </blockquote>
     */
    @NameInMap("FirmwareUrl")
    public String firmwareUrl;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module. OTA modules are the updatable units of devices that belong to the same product.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not configure this parameter, the default OTA module is used. The default value indicates that the complete device firmware is updated.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/186066.html">CreateOTAModule</a> operation to create a custom OTA module. You can call the <a href="https://help.aliyun.com/document_detail/186532.html">ListOTAModuleByProduct</a> operation to query the existing OTA modules of a product.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WifiConfigModify</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("MultiFiles")
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles;

    /**
     * <p>Specifies whether to verify the OTA update package before you create a batch update task.</p>
     * <ul>
     * <li><strong>true</strong> The system verifies the OTA update package before you create a batch update task. This is the default value.</li>
     * <li><strong>false</strong>: The system does not verify the OTA update package before you create a batch update task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedToVerify")
    public Boolean needToVerify;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the OTA update package belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a1uctKe****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The signature algorithm of the OTA update package. Set the value to <strong>MD5</strong>. The value indicates an MD5 signature.</p>
     * <p>Default value: <strong>MD5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("SignMethod")
    public String signMethod;

    /**
     * <p>The version number of the OTA module of the device to be updated.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation and view the <strong>FirmwareVersion</strong> parameter in the response.</p>
     * <blockquote>
     * <ul>
     * <li>If you set the <strong>Type</strong> parameter to <strong>1</strong>, you must configure this parameter, and the value cannot be the same as the update package version that is specified by the <strong>DestVersion</strong> parameter.</li>
     * <li>If you set the <strong>Type</strong> parameter to <strong>0</strong>, this parameter is optional.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("SrcVersion")
    public String srcVersion;

    /**
     * <p>The type of the OTA update package. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The uploaded file contains a full update package. IoT Platform pushes the full update package to a device for update.</li>
     * <li><strong>1</strong>: The uploaded file contains only the differences between the latest update package and the previous update package. IoT Platform pushes only the differences to a device for update.</li>
     * </ul>
     * <p>Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The custom information that you want to send to a device. The format of the custom information has no limits. However, the information cannot exceed 4,096 characters in length.</p>
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
         * <blockquote>
         * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>93230c3bde425a9d7984a594ac56***</p>
         */
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>The name of the file in the update package. The name must be 1 to 32 characters in length. You can specify up to 20 file names. Each name must be unique in the OTA update package.</p>
         * <blockquote>
         * <p>If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Firmware1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The signature of the file. The value is calculated by using the specified <strong>signature algorithm</strong> to sign the file.</p>
         * <blockquote>
         * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the MD5 value of the file in OSS is used as the file signature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>93230c3bde425a9d7984a594ac45****</p>
         */
        @NameInMap("SignValue")
        public String signValue;

        /**
         * <p>The size of the file in the OTA update package. Unit: bytes.</p>
         * <blockquote>
         * <p> If you want to add multiple files to the OTA update package, you can configure this parameter. If you do not configure this parameter, the size of the file in OSS is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The URL of the file. This parameter specifies the storage location of the file in OSS. You can call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate a URL for each file in the OTA update package.</p>
         * <blockquote>
         * <p>If you want to add multiple files to the OTA update package, you must configure this parameter.</p>
         * </blockquote>
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
