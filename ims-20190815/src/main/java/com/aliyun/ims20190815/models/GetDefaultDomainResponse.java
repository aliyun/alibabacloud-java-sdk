// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetDefaultDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DefaultDomainName")
    @Validation(required = true)
    public String defaultDomainName;

    public static GetDefaultDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDomainResponse self = new GetDefaultDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultDomainResponse setDefaultDomainName(String defaultDomainName) {
        this.defaultDomainName = defaultDomainName;
        return this;
    }
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }

}
