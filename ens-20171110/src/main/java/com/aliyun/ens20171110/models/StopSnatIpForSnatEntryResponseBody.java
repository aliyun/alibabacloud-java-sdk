// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopSnatIpForSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9A415CB9-7591-566F-924B-32709578756B</p>
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
