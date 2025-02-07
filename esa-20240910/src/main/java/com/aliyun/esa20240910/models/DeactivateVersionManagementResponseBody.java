// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeactivateVersionManagementResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeactivateVersionManagementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactivateVersionManagementResponseBody self = new DeactivateVersionManagementResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactivateVersionManagementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
