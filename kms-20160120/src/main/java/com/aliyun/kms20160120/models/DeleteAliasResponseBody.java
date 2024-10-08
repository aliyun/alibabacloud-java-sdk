// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteAliasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4c8ae23f-3a42-6791-a4ba-1faa77831c28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAliasResponseBody self = new DeleteAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
