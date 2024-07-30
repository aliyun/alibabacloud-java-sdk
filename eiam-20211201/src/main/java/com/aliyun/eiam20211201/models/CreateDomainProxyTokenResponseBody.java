// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainProxyTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pt_mtohn73423stghoivjmi4jwxxx</p>
     */
    @NameInMap("DomainProxyTokenId")
    public String domainProxyTokenId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
