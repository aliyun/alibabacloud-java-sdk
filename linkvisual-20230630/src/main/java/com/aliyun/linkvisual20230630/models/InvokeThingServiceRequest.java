// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class InvokeThingServiceRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static InvokeThingServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceRequest self = new InvokeThingServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public InvokeThingServiceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public InvokeThingServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InvokeThingServiceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public InvokeThingServiceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
