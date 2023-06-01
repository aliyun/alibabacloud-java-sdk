// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatIpForSnatEntryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnatIpForSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatIpForSnatEntryResponseBody self = new DeleteSnatIpForSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnatIpForSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
