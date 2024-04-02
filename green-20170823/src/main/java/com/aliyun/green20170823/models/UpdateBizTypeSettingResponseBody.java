// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBizTypeSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeSettingResponseBody self = new UpdateBizTypeSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
