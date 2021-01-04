// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VideoCancelScanRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static VideoCancelScanRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoCancelScanRequest self = new VideoCancelScanRequest();
        return TeaModel.build(map, self);
    }

    public VideoCancelScanRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
