// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncScanRequest self = new VideoAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public VideoAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
