// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class LiveStreamAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static LiveStreamAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        LiveStreamAsyncScanResultsRequest self = new LiveStreamAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public LiveStreamAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
