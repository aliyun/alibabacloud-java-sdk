// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123123-3213-345-9941-345345345</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelResponseBody self = new DeleteUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
