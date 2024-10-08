// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveProblemServiceGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5AD6E6BC-2582-4E0E-832D-52CB1B922253</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RemoveProblemServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveProblemServiceGroupResponseBody self = new RemoveProblemServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveProblemServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
