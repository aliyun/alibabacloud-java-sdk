// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMasterSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecResponseBody self = new ModifyMasterSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
