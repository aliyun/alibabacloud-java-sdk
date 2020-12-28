// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetJobUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetJobUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetJobUserResponseBody self = new SetJobUserResponseBody();
        return TeaModel.build(map, self);
    }

    public SetJobUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
