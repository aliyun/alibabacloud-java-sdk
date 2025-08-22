// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveSharedAccountsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8294F4ED-8DBA-5441-B3F2-61C3C5374990</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RemoveSharedAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharedAccountsResponseBody self = new RemoveSharedAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSharedAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
