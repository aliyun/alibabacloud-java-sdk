// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePortRangeListResponseBody extends TeaModel {
    /**
     * <p>The ID of the port list.</p>
     * 
     * <strong>example:</strong>
     * <p>prl-2ze9743****</p>
     */
    @NameInMap("PortRangeListId")
    public String portRangeListId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePortRangeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRangeListResponseBody self = new CreatePortRangeListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortRangeListResponseBody setPortRangeListId(String portRangeListId) {
        this.portRangeListId = portRangeListId;
        return this;
    }
    public String getPortRangeListId() {
        return this.portRangeListId;
    }

    public CreatePortRangeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
