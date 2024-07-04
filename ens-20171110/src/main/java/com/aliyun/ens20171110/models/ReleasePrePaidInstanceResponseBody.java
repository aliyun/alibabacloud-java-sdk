// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePrePaidInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePrePaidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePrePaidInstanceResponseBody self = new ReleasePrePaidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePrePaidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
