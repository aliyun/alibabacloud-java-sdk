// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainExistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CheckCdnDomainExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCdnDomainExistResponseBody self = new CheckCdnDomainExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCdnDomainExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCdnDomainExistResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
