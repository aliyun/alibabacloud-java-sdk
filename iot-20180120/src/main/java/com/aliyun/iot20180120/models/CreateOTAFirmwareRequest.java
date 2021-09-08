// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("FirmwareName")
    @Validation(required = true)
    public String firmwareName;

    @NameInMap("DestVersion")
    @Validation(required = true)
    public String destVersion;

    @NameInMap("FirmwareUrl")
    public String firmwareUrl;

    @NameInMap("FirmwareSign")
    public String firmwareSign;

    @NameInMap("SignMethod")
    public String signMethod;

    @NameInMap("FirmwareSize")
    public Integer firmwareSize;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("FirmwareDesc")
    public String firmwareDesc;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("SrcVersion")
    public String srcVersion;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("NeedToVerify")
    public Boolean needToVerify;

    @NameInMap("Udi")
    public String udi;

    @NameInMap("MultiFiles")
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles;

    public static CreateOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAFirmwareRequest self = new CreateOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public CreateOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateOTAFirmwareRequest setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }
    public String getFirmwareName() {
        return this.firmwareName;
    }

    public CreateOTAFirmwareRequest setDestVersion(String destVersion) {
        this.destVersion = destVersion;
        return this;
    }
    public String getDestVersion() {
        return this.destVersion;
    }

    public CreateOTAFirmwareRequest setFirmwareUrl(String firmwareUrl) {
        this.firmwareUrl = firmwareUrl;
        return this;
    }
    public String getFirmwareUrl() {
        return this.firmwareUrl;
    }

    public CreateOTAFirmwareRequest setFirmwareSign(String firmwareSign) {
        this.firmwareSign = firmwareSign;
        return this;
    }
    public String getFirmwareSign() {
        return this.firmwareSign;
    }

    public CreateOTAFirmwareRequest setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }
    public String getSignMethod() {
        return this.signMethod;
    }

    public CreateOTAFirmwareRequest setFirmwareSize(Integer firmwareSize) {
        this.firmwareSize = firmwareSize;
        return this;
    }
    public Integer getFirmwareSize() {
        return this.firmwareSize;
    }

    public CreateOTAFirmwareRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateOTAFirmwareRequest setFirmwareDesc(String firmwareDesc) {
        this.firmwareDesc = firmwareDesc;
        return this;
    }
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    public CreateOTAFirmwareRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateOTAFirmwareRequest setSrcVersion(String srcVersion) {
        this.srcVersion = srcVersion;
        return this;
    }
    public String getSrcVersion() {
        return this.srcVersion;
    }

    public CreateOTAFirmwareRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateOTAFirmwareRequest setNeedToVerify(Boolean needToVerify) {
        this.needToVerify = needToVerify;
        return this;
    }
    public Boolean getNeedToVerify() {
        return this.needToVerify;
    }

    public CreateOTAFirmwareRequest setUdi(String udi) {
        this.udi = udi;
        return this;
    }
    public String getUdi() {
        return this.udi;
    }

    public CreateOTAFirmwareRequest setMultiFiles(java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles) {
        this.multiFiles = multiFiles;
        return this;
    }
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> getMultiFiles() {
        return this.multiFiles;
    }

    public static class CreateOTAFirmwareRequestMultiFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Url")
        public String url;

        @NameInMap("SignValue")
        public String signValue;

        @NameInMap("FileMd5")
        public String fileMd5;

        public static CreateOTAFirmwareRequestMultiFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAFirmwareRequestMultiFiles self = new CreateOTAFirmwareRequestMultiFiles();
            return TeaModel.build(map, self);
        }

        public CreateOTAFirmwareRequestMultiFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public CreateOTAFirmwareRequestMultiFiles setSignValue(String signValue) {
            this.signValue = signValue;
            return this;
        }
        public String getSignValue() {
            return this.signValue;
        }

        public CreateOTAFirmwareRequestMultiFiles setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

    }

}
