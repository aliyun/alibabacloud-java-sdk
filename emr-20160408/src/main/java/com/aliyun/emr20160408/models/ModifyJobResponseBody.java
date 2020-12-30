// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobResponseBody self = new ModifyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
