// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDtsJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobConfigResponseBody self = new ModifyDtsJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
