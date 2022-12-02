// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Port extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("PortCollectionId")
    public String portCollectionId;

    @NameInMap("PortName")
    public String portName;

    public static Port build(java.util.Map<String, ?> map) throws Exception {
        Port self = new Port();
        return TeaModel.build(map, self);
    }

    public Port setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public Port setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Port setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Port setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public Port setPortName(String portName) {
        this.portName = portName;
        return this;
    }
    public String getPortName() {
        return this.portName;
    }

}
