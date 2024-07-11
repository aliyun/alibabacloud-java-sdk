// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UnTagResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9CBF8DF0-4931-4A54-9B60-4C6E1AB59286</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesResponseBody self = new UnTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
