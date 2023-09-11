// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteSpareIpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSpareIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpareIpsResponseBody self = new DeleteSpareIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSpareIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
