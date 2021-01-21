// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("Scheme")
    public String scheme;

    @NameInMap("SeekTime")
    public Integer seekTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceVodUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlRequest self = new QueryDeviceVodUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceVodUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryDeviceVodUrlRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryDeviceVodUrlRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
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

    public QueryDeviceVodUrlRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
