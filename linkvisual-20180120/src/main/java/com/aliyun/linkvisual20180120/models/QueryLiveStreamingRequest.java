// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("Scheme")
    public String scheme;

    public static QueryLiveStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingRequest self = new QueryLiveStreamingRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryLiveStreamingRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public QueryLiveStreamingRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryLiveStreamingRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryLiveStreamingRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

}
