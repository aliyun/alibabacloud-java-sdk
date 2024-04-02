// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssIncrementCheckSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOssIncrementCheckSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssIncrementCheckSettingResponseBody self = new UpdateOssIncrementCheckSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOssIncrementCheckSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
