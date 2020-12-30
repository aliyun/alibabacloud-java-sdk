// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterBootstrapActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterBootstrapActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterBootstrapActionResponseBody self = new ModifyClusterBootstrapActionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterBootstrapActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
