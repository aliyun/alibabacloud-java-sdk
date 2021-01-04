// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityUnregisterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceIdentityUnregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityUnregisterRequest self = new VoiceIdentityUnregisterRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityUnregisterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VoiceIdentityUnregisterRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
