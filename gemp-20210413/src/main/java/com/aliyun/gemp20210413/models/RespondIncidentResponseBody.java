// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RespondIncidentResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>062E6568-E505-49D6-8DD0-8F11283EB0AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RespondIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RespondIncidentResponseBody self = new RespondIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public RespondIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
