// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static WebpageAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanRequest self = new WebpageAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
