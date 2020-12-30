// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetImageNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetImageNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetImageNameResponseBody self = new SetImageNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetImageNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
