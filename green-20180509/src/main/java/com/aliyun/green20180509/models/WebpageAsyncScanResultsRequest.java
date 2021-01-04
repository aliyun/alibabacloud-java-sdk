// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class WebpageAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static WebpageAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        WebpageAsyncScanResultsRequest self = new WebpageAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public WebpageAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
