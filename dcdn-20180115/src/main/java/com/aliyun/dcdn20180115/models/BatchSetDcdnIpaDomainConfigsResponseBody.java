// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnIpaDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetDcdnIpaDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnIpaDomainConfigsResponseBody self = new BatchSetDcdnIpaDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnIpaDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
