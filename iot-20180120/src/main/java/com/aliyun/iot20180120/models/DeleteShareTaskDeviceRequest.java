// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteShareTaskDeviceRequest extends TeaModel {
    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ShareTaskId")
    public String shareTaskId;

    public static DeleteShareTaskDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShareTaskDeviceRequest self = new DeleteShareTaskDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShareTaskDeviceRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

    public DeleteShareTaskDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteShareTaskDeviceRequest setShareTaskId(String shareTaskId) {
        this.shareTaskId = shareTaskId;
        return this;
    }
    public String getShareTaskId() {
        return this.shareTaskId;
    }

}
