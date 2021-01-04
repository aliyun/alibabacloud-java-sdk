// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DetectFaceRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DetectFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceRequest self = new DetectFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
