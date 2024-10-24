// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F23AEEC7-4D98-4657-A104-0269270*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEaiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiResponseBody self = new DeleteEaiResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEaiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
