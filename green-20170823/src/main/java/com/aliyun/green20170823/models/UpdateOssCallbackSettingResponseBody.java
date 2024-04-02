// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssCallbackSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssCallbackSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCallbackSettingResponseBody self = new UpdateOssCallbackSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssCallbackSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
