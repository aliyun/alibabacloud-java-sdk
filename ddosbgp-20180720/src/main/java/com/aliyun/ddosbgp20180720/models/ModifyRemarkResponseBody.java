// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6AC3597B-7FD5-5E68-97C3-E11F4D010732</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRemarkResponseBody self = new ModifyRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
