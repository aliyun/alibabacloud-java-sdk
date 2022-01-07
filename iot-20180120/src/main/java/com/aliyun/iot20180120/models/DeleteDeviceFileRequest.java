// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceFileRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteDeviceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceFileRequest self = new DeleteDeviceFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceFileRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeleteDeviceFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteDeviceFileRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteDeviceFileRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteDeviceFileRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
