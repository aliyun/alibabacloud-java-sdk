// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtFlowSpecialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    public static FtFlowSpecialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtFlowSpecialResponseBody self = new FtFlowSpecialResponseBody();
        return TeaModel.build(map, self);
    }

    public FtFlowSpecialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtFlowSpecialResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
