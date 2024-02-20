// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class CheckDomainDnsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static CheckDomainDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainDnsResponseBody self = new CheckDomainDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainDnsResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
