// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainStateResponseBody extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static UpdateDomainStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainStateResponseBody self = new UpdateDomainStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainStateResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateDomainStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDomainStateResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
