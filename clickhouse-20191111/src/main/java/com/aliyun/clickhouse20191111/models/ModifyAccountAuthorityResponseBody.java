// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountAuthorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityResponseBody self = new ModifyAccountAuthorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
