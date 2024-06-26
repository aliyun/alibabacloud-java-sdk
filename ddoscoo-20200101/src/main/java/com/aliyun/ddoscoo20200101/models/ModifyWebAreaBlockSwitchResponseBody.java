// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6623EA1F-30FB-5BC8-BEC9-74D55F6F08F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAreaBlockSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockSwitchResponseBody self = new ModifyWebAreaBlockSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
