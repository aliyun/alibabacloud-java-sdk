// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantConfigResponseBody self = new ModifyTenantConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
