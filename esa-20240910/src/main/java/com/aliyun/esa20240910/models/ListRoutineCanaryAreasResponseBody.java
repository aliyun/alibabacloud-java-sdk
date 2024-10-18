// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineCanaryAreasResponseBody extends TeaModel {
    @NameInMap("CanaryAreas")
    public java.util.List<String> canaryAreas;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRoutineCanaryAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineCanaryAreasResponseBody self = new ListRoutineCanaryAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoutineCanaryAreasResponseBody setCanaryAreas(java.util.List<String> canaryAreas) {
        this.canaryAreas = canaryAreas;
        return this;
    }
    public java.util.List<String> getCanaryAreas() {
        return this.canaryAreas;
    }

    public ListRoutineCanaryAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
