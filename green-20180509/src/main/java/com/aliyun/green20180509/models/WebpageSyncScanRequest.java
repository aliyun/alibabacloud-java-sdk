// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageSyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static WebpageSyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        WebpageSyncScanRequest self = new WebpageSyncScanRequest();
        return TeaModel.build(map, self);
    }

    public WebpageSyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
