// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePrivateDNSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrivateDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateDNSResponseBody self = new UpdatePrivateDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
