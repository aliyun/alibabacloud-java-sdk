// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateDingtalkOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDingtalkOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDingtalkOpenPlatformConfigResponseBody self = new UpdateDingtalkOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDingtalkOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
