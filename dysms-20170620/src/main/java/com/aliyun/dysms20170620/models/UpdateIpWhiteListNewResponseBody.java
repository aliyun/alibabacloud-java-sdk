// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UpdateIpWhiteListNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static UpdateIpWhiteListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpWhiteListNewResponseBody self = new UpdateIpWhiteListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpWhiteListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIpWhiteListNewResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
