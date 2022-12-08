// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordUrlRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SeekTime")
    public Integer seekTime;

    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryRecordUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordUrlRequest self = new QueryRecordUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordUrlRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryRecordUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryRecordUrlRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordUrlRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordUrlRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryRecordUrlRequest setSeekTime(Integer seekTime) {
        this.seekTime = seekTime;
        return this;
    }
    public Integer getSeekTime() {
        return this.seekTime;
    }

    public QueryRecordUrlRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
