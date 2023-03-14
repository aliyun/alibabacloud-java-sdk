// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class OpenDomainSlsConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenDomainSlsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDomainSlsConfigResponseBody self = new OpenDomainSlsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDomainSlsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
