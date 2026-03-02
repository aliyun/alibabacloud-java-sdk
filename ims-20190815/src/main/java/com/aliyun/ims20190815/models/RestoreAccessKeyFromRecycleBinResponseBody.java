// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RestoreAccessKeyFromRecycleBinResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreAccessKeyFromRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreAccessKeyFromRecycleBinResponseBody self = new RestoreAccessKeyFromRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreAccessKeyFromRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
