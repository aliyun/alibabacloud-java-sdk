// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteCdnDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdnDomainResponseBody self = new DeleteCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
