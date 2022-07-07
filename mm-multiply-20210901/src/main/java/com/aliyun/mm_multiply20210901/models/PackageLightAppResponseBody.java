// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class PackageLightAppResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PackageLightAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PackageLightAppResponseBody self = new PackageLightAppResponseBody();
        return TeaModel.build(map, self);
    }

    public PackageLightAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
