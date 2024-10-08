// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class AddProblemServiceGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5AD6E6BC-2582-4E0E-832D-52CB1B922253</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddProblemServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProblemServiceGroupResponseBody self = new AddProblemServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProblemServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
