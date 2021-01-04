// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static LiveStreamAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanRequest self = new LiveStreamAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
