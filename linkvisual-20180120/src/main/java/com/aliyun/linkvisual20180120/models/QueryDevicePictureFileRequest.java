// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileRequest extends TeaModel {
    @NameInMap("CaptureId")
    public String captureId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PictureType")
    public Integer pictureType;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ThumbWidth")
    public Integer thumbWidth;

    public static QueryDevicePictureFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileRequest self = new QueryDevicePictureFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileRequest setCaptureId(String captureId) {
        this.captureId = captureId;
        return this;
    }
    public String getCaptureId() {
        return this.captureId;
    }

    public QueryDevicePictureFileRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePictureFileRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public QueryDevicePictureFileRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePictureFileRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePictureFileRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

    public QueryDevicePictureFileRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePictureFileRequest setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }
    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

}
