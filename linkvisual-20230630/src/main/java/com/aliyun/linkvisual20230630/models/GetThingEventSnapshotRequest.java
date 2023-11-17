// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetThingEventSnapshotRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetThingEventSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingEventSnapshotRequest self = new GetThingEventSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public GetThingEventSnapshotRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetThingEventSnapshotRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetThingEventSnapshotRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public GetThingEventSnapshotRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
