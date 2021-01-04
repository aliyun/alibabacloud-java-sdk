// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcIDCBlockSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static UpdateCcIDCBlockSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcIDCBlockSwitchResponseBody self = new UpdateCcIDCBlockSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCcIDCBlockSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCcIDCBlockSwitchResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

}
