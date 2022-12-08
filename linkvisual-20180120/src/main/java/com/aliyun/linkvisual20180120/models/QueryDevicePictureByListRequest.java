// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureByListRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PictureIdList")
    public java.util.List<String> pictureIdList;

    @NameInMap("PictureType")
    public Integer pictureType;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ThumbWidth")
    public Integer thumbWidth;

    public static QueryDevicePictureByListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureByListRequest self = new QueryDevicePictureByListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureByListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePictureByListRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public QueryDevicePictureByListRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePictureByListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePictureByListRequest setPictureIdList(java.util.List<String> pictureIdList) {
        this.pictureIdList = pictureIdList;
        return this;
    }
    public java.util.List<String> getPictureIdList() {
        return this.pictureIdList;
    }

    public QueryDevicePictureByListRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

    public QueryDevicePictureByListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePictureByListRequest setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }
    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

}
