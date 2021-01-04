// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VoiceAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanRequest self = new VoiceAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
