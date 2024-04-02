// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateNotificationSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNotificationSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotificationSettingResponseBody self = new UpdateNotificationSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNotificationSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
