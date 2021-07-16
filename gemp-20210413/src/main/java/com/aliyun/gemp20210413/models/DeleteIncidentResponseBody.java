// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIncidentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIncidentResponseBody self = new DeleteIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
