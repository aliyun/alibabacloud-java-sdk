// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMaintainWindowResponseBody extends TeaModel {
    @NameInMap("maintainWindow")
    public MaintainWindowForView maintainWindow;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaintainWindowResponseBody self = new GetMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaintainWindowResponseBody setMaintainWindow(MaintainWindowForView maintainWindow) {
        this.maintainWindow = maintainWindow;
        return this;
    }
    public MaintainWindowForView getMaintainWindow() {
        return this.maintainWindow;
    }

    public GetMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
