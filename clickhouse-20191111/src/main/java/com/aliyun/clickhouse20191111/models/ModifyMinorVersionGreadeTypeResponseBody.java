// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyMinorVersionGreadeTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMinorVersionGreadeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMinorVersionGreadeTypeResponseBody self = new ModifyMinorVersionGreadeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMinorVersionGreadeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
