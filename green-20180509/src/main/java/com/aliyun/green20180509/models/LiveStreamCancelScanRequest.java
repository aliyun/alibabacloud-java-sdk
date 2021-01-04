// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamCancelScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static LiveStreamCancelScanRequest build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamCancelScanRequest self = new LiveStreamCancelScanRequest();
        return TeaModel.build(map, self);
    }

    public LiveStreamCancelScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
