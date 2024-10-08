// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65885B52-00EC-5728-96******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultIPSConfigResponseBody self = new ModifyDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultIPSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
