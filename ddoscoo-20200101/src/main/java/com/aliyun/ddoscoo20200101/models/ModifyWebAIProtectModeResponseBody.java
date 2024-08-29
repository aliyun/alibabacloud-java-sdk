// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAIProtectModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectModeResponseBody self = new ModifyWebAIProtectModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
