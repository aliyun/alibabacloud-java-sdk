// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListLimitationsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7CE283B7-50EC-5ABD-9EE5-FC94C38BE37F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListLimitationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLimitationsResponseBody self = new ListLimitationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLimitationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
