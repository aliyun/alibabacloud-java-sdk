// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersResponseBody self = new ModifyParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
