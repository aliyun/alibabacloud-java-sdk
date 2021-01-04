// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanResultsRequest self = new VideoAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
