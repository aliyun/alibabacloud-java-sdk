// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyClusterDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescriptionResponseBody self = new ModifyClusterDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
