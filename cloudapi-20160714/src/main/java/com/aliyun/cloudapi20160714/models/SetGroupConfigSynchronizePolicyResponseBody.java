// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupConfigSynchronizePolicyResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SetGroupConfigSynchronizePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGroupConfigSynchronizePolicyResponseBody self = new SetGroupConfigSynchronizePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGroupConfigSynchronizePolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetGroupConfigSynchronizePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
