// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainProxyTokenResponseBody extends TeaModel {
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainProxyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainProxyTokenResponseBody self = new CreateDomainProxyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainProxyTokenResponseBody setDomainProxyTokenId(String domainProxyTokenId) {
        this.domainProxyTokenId = domainProxyTokenId;
        return this;
    }
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    public CreateDomainProxyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
