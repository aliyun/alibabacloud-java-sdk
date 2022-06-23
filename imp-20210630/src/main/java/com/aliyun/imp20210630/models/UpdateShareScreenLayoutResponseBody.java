// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateShareScreenLayoutResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateShareScreenLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareScreenLayoutResponseBody self = new UpdateShareScreenLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateShareScreenLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
