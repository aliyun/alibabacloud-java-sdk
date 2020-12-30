// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNoteResponseBody self = new DeleteNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
