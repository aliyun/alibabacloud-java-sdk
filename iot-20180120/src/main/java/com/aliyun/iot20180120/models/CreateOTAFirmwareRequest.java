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
    @Validation(required = true)
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

}
