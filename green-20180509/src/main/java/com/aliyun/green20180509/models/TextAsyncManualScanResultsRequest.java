// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextAsyncManualScanResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static TextAsyncManualScanResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        TextAsyncManualScanResultsRequest self = new TextAsyncManualScanResultsRequest();
        return TeaModel.build(map, self);
    }

    public TextAsyncManualScanResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
