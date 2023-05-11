// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingRequest extends TeaModel {
    @NameInMap("CacheDuration")
    public Integer cacheDuration;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EnableStun")
    public Boolean enableStun;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("ForceIFrame")
    public Boolean forceIFrame;

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

    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryLiveStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingRequest self = new QueryLiveStreamingRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingRequest setCacheDuration(Integer cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }
    public Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public QueryLiveStreamingRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryLiveStreamingRequest setEnableStun(Boolean enableStun) {
        this.enableStun = enableStun;
        return this;
    }
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    public QueryLiveStreamingRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryLiveStreamingRequest setForceIFrame(Boolean forceIFrame) {
        this.forceIFrame = forceIFrame;
        return this;
    }
    public Boolean getForceIFrame() {
        return this.forceIFrame;
    }

    public QueryLiveStreamingRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryLiveStreamingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryLiveStreamingRequest setPlayUnLimited(Boolean playUnLimited) {
        this.playUnLimited = playUnLimited;
        return this;
    }
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    public QueryLiveStreamingRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryLiveStreamingRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public QueryLiveStreamingRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryLiveStreamingRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public QueryLiveStreamingRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
