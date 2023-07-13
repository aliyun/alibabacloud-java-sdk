// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAttributesResponseBody self = new ModifyClusterAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
