// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreUserFromRecycleBinResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreUserFromRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreUserFromRecycleBinResponseBody self = new RestoreUserFromRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreUserFromRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
