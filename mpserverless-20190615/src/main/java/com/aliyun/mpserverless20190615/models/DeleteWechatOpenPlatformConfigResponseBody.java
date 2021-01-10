// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWechatOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWechatOpenPlatformConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWechatOpenPlatformConfigResponseBody self = new DeleteWechatOpenPlatformConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWechatOpenPlatformConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
