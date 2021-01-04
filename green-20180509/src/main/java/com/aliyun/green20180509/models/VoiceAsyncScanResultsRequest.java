// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanResultsRequest self = new VoiceAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
