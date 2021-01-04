// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceCancelScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceCancelScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceCancelScanRequest self = new VoiceCancelScanRequest();
        return TeaModel.build(map, self);
    }

    public VoiceCancelScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
