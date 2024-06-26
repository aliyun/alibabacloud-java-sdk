// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyAndroidInstanceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6C83EBE3-F267-5F11-ABF8-4E7B90B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAndroidInstanceGroupResponseBody self = new ModifyAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
