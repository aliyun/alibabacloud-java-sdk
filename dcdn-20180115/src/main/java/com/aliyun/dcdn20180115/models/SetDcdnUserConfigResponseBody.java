// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnUserConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnUserConfigResponseBody self = new SetDcdnUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
