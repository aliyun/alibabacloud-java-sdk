// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class FileAsyncScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static FileAsyncScanRequest build(java.util.Map<String, ?> map) throws Exception {
        FileAsyncScanRequest self = new FileAsyncScanRequest();
        return TeaModel.build(map, self);
    }

    public FileAsyncScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
