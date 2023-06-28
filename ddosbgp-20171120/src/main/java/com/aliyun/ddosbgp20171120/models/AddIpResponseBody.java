// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class AddIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpResponseBody self = new AddIpResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
