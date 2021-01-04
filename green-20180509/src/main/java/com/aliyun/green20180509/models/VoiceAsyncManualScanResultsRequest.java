// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceAsyncManualScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanResultsRequest self = new VoiceAsyncManualScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
