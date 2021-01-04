// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceIdentityStartCheckRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceIdentityStartCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceIdentityStartCheckRequest self = new VoiceIdentityStartCheckRequest();
        return TeaModel.build(map, self);
    }

    public VoiceIdentityStartCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VoiceIdentityStartCheckRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
