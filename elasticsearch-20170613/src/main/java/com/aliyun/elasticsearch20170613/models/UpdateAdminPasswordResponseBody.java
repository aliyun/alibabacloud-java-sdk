// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAdminPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAdminPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdminPasswordResponseBody self = new UpdateAdminPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdminPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
