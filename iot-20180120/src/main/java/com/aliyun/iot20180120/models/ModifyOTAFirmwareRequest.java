// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ModifyOTAFirmwareRequest extends TeaModel {
    @NameInMap("FirmwareDesc")
    public String firmwareDesc;

    @NameInMap("FirmwareId")
    public String firmwareId;

    @NameInMap("FirmwareName")
    public String firmwareName;

    @NameInMap("FirmwareUdi")
    public String firmwareUdi;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static ModifyOTAFirmwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOTAFirmwareRequest self = new ModifyOTAFirmwareRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOTAFirmwareRequest setFirmwareDesc(String firmwareDesc) {
        this.firmwareDesc = firmwareDesc;
        return this;
    }
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    public ModifyOTAFirmwareRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public ModifyOTAFirmwareRequest setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }
    public String getFirmwareName() {
        return this.firmwareName;
    }

    public ModifyOTAFirmwareRequest setFirmwareUdi(String firmwareUdi) {
        this.firmwareUdi = firmwareUdi;
        return this;
    }
    public String getFirmwareUdi() {
        return this.firmwareUdi;
    }

    public ModifyOTAFirmwareRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ModifyOTAFirmwareRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
