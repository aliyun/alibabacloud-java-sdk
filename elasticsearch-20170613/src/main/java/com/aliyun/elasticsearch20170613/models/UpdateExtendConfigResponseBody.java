// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendConfigResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExtendConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendConfigResponseBody self = new UpdateExtendConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExtendConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateExtendConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
