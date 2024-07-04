// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstanceHealthResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B755AE57-6093-43E4-938E-DEA422A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstanceHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceHealthResponseBody self = new SetInstanceHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
