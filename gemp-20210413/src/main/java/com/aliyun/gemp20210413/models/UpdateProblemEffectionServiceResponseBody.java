// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemEffectionServiceResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemEffectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemEffectionServiceResponseBody self = new UpdateProblemEffectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemEffectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
