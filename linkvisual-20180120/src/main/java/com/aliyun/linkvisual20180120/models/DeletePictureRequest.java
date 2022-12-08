// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeletePictureRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PictureIdList")
    public java.util.List<String> pictureIdList;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeletePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureRequest self = new DeletePictureRequest();
        return TeaModel.build(map, self);
    }

    public DeletePictureRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeletePictureRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeletePictureRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeletePictureRequest setPictureIdList(java.util.List<String> pictureIdList) {
        this.pictureIdList = pictureIdList;
        return this;
    }
    public java.util.List<String> getPictureIdList() {
        return this.pictureIdList;
    }

    public DeletePictureRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
