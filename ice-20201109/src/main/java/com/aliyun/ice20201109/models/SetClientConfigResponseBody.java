// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetClientConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 配置是否成功
    @NameInMap("Success")
    public Boolean success;

    public static SetClientConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClientConfigResponseBody self = new SetClientConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClientConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetClientConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
