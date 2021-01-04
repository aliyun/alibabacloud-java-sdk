// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityCheckRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceIdentityCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityCheckRequest self = new VoiceIdentityCheckRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VoiceIdentityCheckRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
