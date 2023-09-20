// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Scheme")
    public String scheme;

    public static QueryVoiceIntercomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomRequest self = new QueryVoiceIntercomRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryVoiceIntercomRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryVoiceIntercomRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryVoiceIntercomRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryVoiceIntercomRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

}
