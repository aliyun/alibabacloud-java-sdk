// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDingtalkOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDingtalkOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDingtalkOpenPlatformConfigResponseBody self = new DeleteDingtalkOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDingtalkOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
