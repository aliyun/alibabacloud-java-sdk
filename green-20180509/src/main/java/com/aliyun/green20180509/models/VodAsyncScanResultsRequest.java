// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VodAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanResultsRequest self = new VodAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
