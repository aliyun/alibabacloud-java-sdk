// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyGroupAuthAppCodeForBackendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGroupAuthAppCodeForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupAuthAppCodeForBackendResponseBody self = new ModifyGroupAuthAppCodeForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGroupAuthAppCodeForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
