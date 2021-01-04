// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextAsyncManualScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static TextAsyncManualScanRequest build(java.util.Map<String, ?> map) throws Exception {
        TextAsyncManualScanRequest self = new TextAsyncManualScanRequest();
        return TeaModel.build(map, self);
    }

    public TextAsyncManualScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
