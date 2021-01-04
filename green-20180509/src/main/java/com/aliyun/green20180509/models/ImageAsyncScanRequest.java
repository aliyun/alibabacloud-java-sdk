// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanRequest self = new ImageAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
