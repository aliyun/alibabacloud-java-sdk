// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateInstanceInternetProtocolRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("IpVersion")
    public String ipVersion;

    public static UpdateInstanceInternetProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInternetProtocolRequest self = new UpdateInstanceInternetProtocolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInternetProtocolRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateInstanceInternetProtocolRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

}
