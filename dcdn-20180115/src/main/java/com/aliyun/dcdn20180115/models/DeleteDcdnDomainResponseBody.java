// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnDomainResponseBody self = new DeleteDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
