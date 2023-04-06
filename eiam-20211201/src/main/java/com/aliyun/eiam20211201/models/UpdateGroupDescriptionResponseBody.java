// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDescriptionResponseBody self = new UpdateGroupDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
