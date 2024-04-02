// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteNotificationContactsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNotificationContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationContactsResponseBody self = new DeleteNotificationContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
