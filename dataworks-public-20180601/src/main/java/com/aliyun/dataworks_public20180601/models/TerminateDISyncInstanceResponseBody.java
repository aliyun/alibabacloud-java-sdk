// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponseBody self = new TerminateDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
