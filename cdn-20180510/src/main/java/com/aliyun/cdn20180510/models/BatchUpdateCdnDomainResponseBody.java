// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchUpdateCdnDomainResponseBody extends TeaModel {
    /**
     * <p>The information about the addresses of origin servers.</p>
     * <br>
     * <p>>  You can set only one of **Sources** and **TopLevelDomain**. If you set both **Sources** and **TopLevelDomain**, **TopLevelDomain** does not take effect.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateCdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateCdnDomainResponseBody self = new BatchUpdateCdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateCdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
