// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteHyperNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>041724FC-2BD7-58B1-863B-B42022D4B351</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHyperNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHyperNodeResponseBody self = new DeleteHyperNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHyperNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
