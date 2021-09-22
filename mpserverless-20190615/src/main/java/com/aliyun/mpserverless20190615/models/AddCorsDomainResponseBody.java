// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddCorsDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainId")
    public String domainId;

    public static AddCorsDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCorsDomainResponseBody self = new AddCorsDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCorsDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCorsDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

}
