// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceSyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static VoiceSyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceSyncScanRequest self = new VoiceSyncScanRequest();
        return TeaModel.build(map, self);
    }

    public VoiceSyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public VoiceSyncScanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
