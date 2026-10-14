// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAIProtectSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectSwitchResponseBody self = new ModifyWebAIProtectSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
