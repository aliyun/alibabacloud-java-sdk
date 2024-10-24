// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaisEiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F23AEEC7-4D98-4657-A104-02692701****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaisEiResponseBody self = new DeleteEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
