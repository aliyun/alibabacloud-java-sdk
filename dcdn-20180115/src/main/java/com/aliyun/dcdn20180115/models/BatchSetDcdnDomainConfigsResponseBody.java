// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>> </p>
     * <p>*   You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,)</p>
     * <p>*   You can call this operation up to 30 times per second per account.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetDcdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainConfigsResponseBody self = new BatchSetDcdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
