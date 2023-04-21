// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetContentAnalyzeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetContentAnalyzeConfigResponseBody self = new SetContentAnalyzeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetContentAnalyzeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetContentAnalyzeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
