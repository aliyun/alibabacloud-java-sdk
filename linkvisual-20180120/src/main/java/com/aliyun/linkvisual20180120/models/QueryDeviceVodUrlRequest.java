// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EnableStun")
    public Boolean enableStun;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("FileName")
    public String fileName;

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

    public static QueryDeviceVodUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlRequest self = new QueryDeviceVodUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceVodUrlRequest setEnableStun(Boolean enableStun) {
        this.enableStun = enableStun;
        return this;
    }
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    public QueryDeviceVodUrlRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryDeviceVodUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryDeviceVodUrlRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceVodUrlRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceVodUrlRequest setPlayUnLimited(Boolean playUnLimited) {
        this.playUnLimited = playUnLimited;
        return this;
    }
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    public QueryDeviceVodUrlRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceVodUrlRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public QueryDeviceVodUrlRequest setSeekTime(Integer seekTime) {
        this.seekTime = seekTime;
        return this;
    }
    public Integer getSeekTime() {
        return this.seekTime;
    }

    public QueryDeviceVodUrlRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryDeviceVodUrlRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
