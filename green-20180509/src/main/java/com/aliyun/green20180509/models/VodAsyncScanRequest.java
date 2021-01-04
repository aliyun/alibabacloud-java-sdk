// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VodAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VodAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VodAsyncScanRequest self = new VodAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public VodAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
