// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class EditSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EditSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditSessionResponseBody self = new EditSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public EditSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
