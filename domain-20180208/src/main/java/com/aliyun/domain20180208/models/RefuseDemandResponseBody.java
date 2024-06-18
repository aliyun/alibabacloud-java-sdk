// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RefuseDemandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>497F7522-82B0-4BD4-84FE-AE8749E4C2F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefuseDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefuseDemandResponseBody self = new RefuseDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public RefuseDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
