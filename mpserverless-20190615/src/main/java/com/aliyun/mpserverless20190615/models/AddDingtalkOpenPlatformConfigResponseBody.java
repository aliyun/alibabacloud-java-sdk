// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddDingtalkOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddDingtalkOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDingtalkOpenPlatformConfigResponseBody self = new AddDingtalkOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDingtalkOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
