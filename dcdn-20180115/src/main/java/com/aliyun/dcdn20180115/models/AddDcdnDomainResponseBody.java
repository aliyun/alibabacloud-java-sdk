// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnDomainResponseBody self = new AddDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
