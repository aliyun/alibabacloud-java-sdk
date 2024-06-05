// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessPointResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessPointResponseBody self = new ModifyAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
