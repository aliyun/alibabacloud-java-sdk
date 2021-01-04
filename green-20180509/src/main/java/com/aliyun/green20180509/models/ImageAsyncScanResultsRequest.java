// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncScanResultsRequest self = new ImageAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public ImageAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
