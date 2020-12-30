// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterMetaCollectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterMetaCollectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterMetaCollectResponseBody self = new ModifyClusterMetaCollectResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterMetaCollectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
