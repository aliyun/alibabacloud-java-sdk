// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageAsyncManualScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanRequest self = new ImageAsyncManualScanRequest();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
