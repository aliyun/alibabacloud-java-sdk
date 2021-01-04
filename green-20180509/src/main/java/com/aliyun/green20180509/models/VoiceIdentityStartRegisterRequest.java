// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartRegisterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceIdentityStartRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartRegisterRequest self = new VoiceIdentityStartRegisterRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartRegisterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VoiceIdentityStartRegisterRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
