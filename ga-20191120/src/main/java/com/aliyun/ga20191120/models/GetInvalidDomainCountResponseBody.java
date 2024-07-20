// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetInvalidDomainCountResponseBody extends TeaModel {
    /**
     * <p>The number of invalid domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InvalidDomainCount")
    public String invalidDomainCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInvalidDomainCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInvalidDomainCountResponseBody self = new GetInvalidDomainCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInvalidDomainCountResponseBody setInvalidDomainCount(String invalidDomainCount) {
        this.invalidDomainCount = invalidDomainCount;
        return this;
    }
    public String getInvalidDomainCount() {
        return this.invalidDomainCount;
    }

    public GetInvalidDomainCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
