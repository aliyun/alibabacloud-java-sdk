// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdatePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePackageResponseBody self = new UpdatePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
