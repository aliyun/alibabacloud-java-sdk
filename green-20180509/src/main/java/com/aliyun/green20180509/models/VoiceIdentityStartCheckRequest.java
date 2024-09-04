// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartCheckRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static VoiceIdentityStartCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartCheckRequest self = new VoiceIdentityStartCheckRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartCheckRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public VoiceIdentityStartCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
