// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetResponseBody self = new UpdateIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
