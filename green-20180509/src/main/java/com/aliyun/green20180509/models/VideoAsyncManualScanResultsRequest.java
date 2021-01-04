// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoAsyncManualScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanResultsRequest self = new VideoAsyncManualScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
