// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class AddIpfilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpfilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpfilterResponseBody self = new AddIpfilterResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpfilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
