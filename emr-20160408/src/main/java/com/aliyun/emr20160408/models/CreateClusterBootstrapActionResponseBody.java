// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterBootstrapActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterBootstrapActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBootstrapActionResponseBody self = new CreateClusterBootstrapActionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterBootstrapActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
