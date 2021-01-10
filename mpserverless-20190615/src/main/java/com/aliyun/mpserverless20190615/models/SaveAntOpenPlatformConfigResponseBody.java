// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAntOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveAntOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAntOpenPlatformConfigResponseBody self = new SaveAntOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAntOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
