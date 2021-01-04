// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncManualScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageAsyncManualScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncManualScanResultsRequest self = new ImageAsyncManualScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public ImageAsyncManualScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
