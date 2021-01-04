// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoAsyncManualScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoAsyncManualScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoAsyncManualScanRequest self = new VideoAsyncManualScanRequest();
        return TeaModel.build(map, self);
    }

    public VideoAsyncManualScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
