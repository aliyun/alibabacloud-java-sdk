// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListResponseBody self = new ModifyPrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
