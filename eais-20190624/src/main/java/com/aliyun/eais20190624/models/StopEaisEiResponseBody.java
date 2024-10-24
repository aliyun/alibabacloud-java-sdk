// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StopEaisEiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F23AEEC7-4D98-4657-A104-02692701****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopEaisEiResponseBody self = new StopEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public StopEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
