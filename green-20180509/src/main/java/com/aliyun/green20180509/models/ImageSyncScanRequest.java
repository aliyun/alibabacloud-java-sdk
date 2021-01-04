// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageSyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageSyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageSyncScanRequest self = new ImageSyncScanRequest();
        return TeaModel.build(map, self);
    }

    public ImageSyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
