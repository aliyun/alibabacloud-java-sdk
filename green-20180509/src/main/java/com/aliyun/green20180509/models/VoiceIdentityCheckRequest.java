// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityCheckRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static VoiceIdentityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityCheckRequest self = new VoiceIdentityCheckRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityCheckRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public VoiceIdentityCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
