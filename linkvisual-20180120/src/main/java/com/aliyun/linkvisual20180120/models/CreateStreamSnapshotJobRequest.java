// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotJobRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SnapshotInterval")
    public Integer snapshotInterval;

    @NameInMap("StreamType")
    public Integer streamType;

    public static CreateStreamSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotJobRequest self = new CreateStreamSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotJobRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateStreamSnapshotJobRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateStreamSnapshotJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateStreamSnapshotJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateStreamSnapshotJobRequest setSnapshotInterval(Integer snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
        return this;
    }
    public Integer getSnapshotInterval() {
        return this.snapshotInterval;
    }

    public CreateStreamSnapshotJobRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
