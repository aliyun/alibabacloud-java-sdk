// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UntagDcdnResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97C68796-EB7F-4D41-9D5B-12B909D76508</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagDcdnResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagDcdnResourcesResponseBody self = new UntagDcdnResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagDcdnResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
