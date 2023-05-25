// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SendBizCocChangeCallbackRequest extends TeaModel {
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("Result")
    public Boolean result;

    public static SendBizCocChangeCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBizCocChangeCallbackRequest self = new SendBizCocChangeCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SendBizCocChangeCallbackRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public SendBizCocChangeCallbackRequest setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
