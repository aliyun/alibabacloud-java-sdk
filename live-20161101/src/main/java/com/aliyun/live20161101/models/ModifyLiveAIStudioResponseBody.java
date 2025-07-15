// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveAIStudioResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0BA6B3C4-525A-5381-A2B0-5351323F31C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveAIStudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveAIStudioResponseBody self = new ModifyLiveAIStudioResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveAIStudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
