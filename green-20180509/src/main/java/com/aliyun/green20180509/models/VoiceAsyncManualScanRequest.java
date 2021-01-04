// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceAsyncManualScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanRequest self = new VoiceAsyncManualScanRequest();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
