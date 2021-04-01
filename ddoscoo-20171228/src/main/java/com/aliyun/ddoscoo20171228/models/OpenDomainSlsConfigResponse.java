// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class OpenDomainSlsConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static OpenDomainSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDomainSlsConfigResponse self = new OpenDomainSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public OpenDomainSlsConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
