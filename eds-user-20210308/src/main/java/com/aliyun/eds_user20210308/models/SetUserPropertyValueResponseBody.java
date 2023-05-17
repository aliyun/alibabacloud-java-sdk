// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SetUserPropertyValueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserPropertyValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserPropertyValueResponseBody self = new SetUserPropertyValueResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserPropertyValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
