// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlByTimeRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Integer beginTime;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EnableStun")
    public Boolean enableStun;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PlayUnLimited")
    public Boolean playUnLimited;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Scheme")
    public String scheme;

    @NameInMap("SeekTime")
    public Integer seekTime;

    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryDeviceVodUrlByTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlByTimeRequest self = new QueryDeviceVodUrlByTimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlByTimeRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryDeviceVodUrlByTimeRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceVodUrlByTimeRequest setEnableStun(Boolean enableStun) {
        this.enableStun = enableStun;
        return this;
    }
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    public QueryDeviceVodUrlByTimeRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryDeviceVodUrlByTimeRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryDeviceVodUrlByTimeRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceVodUrlByTimeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceVodUrlByTimeRequest setPlayUnLimited(Boolean playUnLimited) {
        this.playUnLimited = playUnLimited;
        return this;
    }
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    public QueryDeviceVodUrlByTimeRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceVodUrlByTimeRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public QueryDeviceVodUrlByTimeRequest setSeekTime(Integer seekTime) {
        this.seekTime = seekTime;
        return this;
    }
    public Integer getSeekTime() {
        return this.seekTime;
    }

    public QueryDeviceVodUrlByTimeRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryDeviceVodUrlByTimeRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
