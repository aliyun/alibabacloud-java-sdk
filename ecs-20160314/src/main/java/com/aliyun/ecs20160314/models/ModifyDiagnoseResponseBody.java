// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyDiagnoseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Integer data;

    public static ModifyDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiagnoseResponseBody self = new ModifyDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDiagnoseResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

}
