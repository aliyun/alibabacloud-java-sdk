// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoSyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoSyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoSyncScanRequest self = new VideoSyncScanRequest();
        return TeaModel.build(map, self);
    }

    public VideoSyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
