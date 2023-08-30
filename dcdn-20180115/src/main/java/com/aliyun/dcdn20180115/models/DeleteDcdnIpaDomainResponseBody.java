// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnIpaDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnIpaDomainResponseBody self = new DeleteDcdnIpaDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnIpaDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
