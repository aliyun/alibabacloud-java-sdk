// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class AddCdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCdnDomainResponseBody self = new AddCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
