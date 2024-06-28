// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class AddServiceSharedAccountsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2815213-EA4F-5759-8EA1-56DD051BB3FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddServiceSharedAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSharedAccountsResponseBody self = new AddServiceSharedAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServiceSharedAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
