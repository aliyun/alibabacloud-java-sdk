// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopSnatIpForSnatEntryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopSnatIpForSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSnatIpForSnatEntryResponseBody self = new StopSnatIpForSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSnatIpForSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
