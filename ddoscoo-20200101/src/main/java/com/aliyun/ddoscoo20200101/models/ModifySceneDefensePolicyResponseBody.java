// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySceneDefensePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifySceneDefensePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneDefensePolicyResponseBody self = new ModifySceneDefensePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySceneDefensePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySceneDefensePolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
