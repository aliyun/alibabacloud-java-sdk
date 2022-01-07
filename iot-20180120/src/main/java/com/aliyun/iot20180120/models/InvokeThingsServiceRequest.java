// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingsServiceRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static InvokeThingsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingsServiceRequest self = new InvokeThingsServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeThingsServiceRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public InvokeThingsServiceRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public InvokeThingsServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InvokeThingsServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public InvokeThingsServiceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
