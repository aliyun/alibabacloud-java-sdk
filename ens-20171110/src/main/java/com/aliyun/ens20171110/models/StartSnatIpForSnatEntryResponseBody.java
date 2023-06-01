// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartSnatIpForSnatEntryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartSnatIpForSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSnatIpForSnatEntryResponseBody self = new StartSnatIpForSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSnatIpForSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
