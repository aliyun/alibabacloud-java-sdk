// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyScheduleMethodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScheduleMethodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduleMethodResponseBody self = new ModifyScheduleMethodResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScheduleMethodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
