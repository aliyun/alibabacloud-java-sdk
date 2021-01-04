// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static FileAsyncScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanResultsRequest self = new FileAsyncScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
