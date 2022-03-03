// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAFirmwareRequest extends TeaModel {
    @NameInMap("DestVersion")
    public String destVersion;

    @NameInMap("FirmwareDesc")
    public String firmwareDesc;

    @NameInMap("FirmwareName")
    public String firmwareName;

    @NameInMap("FirmwareSign")
    public String firmwareSign;

    @NameInMap("FirmwareSize")
    public Integer firmwareSize;

    @NameInMap("FirmwareUrl")
    public String firmwareUrl;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("MultiFiles")
    public java.util.List<CreateOTAFirmwareRequestMultiFiles> multiFiles;

    @NameInMap("NeedToVerify")
    public Boolean needToVerify;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SignMethod")
    public String signMethod;

    @NameInMap("SrcVersion")
    public String srcVersion;

    @NameInMap("Type")
    public Integer type;

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
        @NameInMap("FileMd5")
        public String fileMd5;

        @NameInMap("Name")
        public String name;

        @NameInMap("SignValue")
        public String signValue;

        @NameInMap("Size")
        public Integer size;

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
