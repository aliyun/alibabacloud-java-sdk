// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyDisplayConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A578AD3A-8E7C-54FE-A09F-B060941*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDisplayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDisplayConfigResponseBody self = new ModifyDisplayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDisplayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
