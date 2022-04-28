// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiConfigurationResponseBody self = new ModifyApiConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
