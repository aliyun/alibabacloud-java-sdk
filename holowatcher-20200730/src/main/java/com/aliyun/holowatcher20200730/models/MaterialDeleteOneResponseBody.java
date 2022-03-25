// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialDeleteOneResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static MaterialDeleteOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialDeleteOneResponseBody self = new MaterialDeleteOneResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialDeleteOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
