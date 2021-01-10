// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWechatOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveWechatOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWechatOpenPlatformConfigResponseBody self = new SaveWechatOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWechatOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
