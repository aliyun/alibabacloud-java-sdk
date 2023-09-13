// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteDomainProxyTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainProxyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainProxyTokenResponseBody self = new DeleteDomainProxyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainProxyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
