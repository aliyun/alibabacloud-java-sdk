// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static TextScanRequest build(java.util.Map<String, ?> map) throws Exception {
        TextScanRequest self = new TextScanRequest();
        return TeaModel.build(map, self);
    }

    public TextScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
