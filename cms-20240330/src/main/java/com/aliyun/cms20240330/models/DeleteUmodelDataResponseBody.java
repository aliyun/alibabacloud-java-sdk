// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>111111-222-333-1111-33333</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteUmodelDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelDataResponseBody self = new DeleteUmodelDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
