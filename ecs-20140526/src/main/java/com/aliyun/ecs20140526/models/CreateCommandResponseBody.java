// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandResponseBody extends TeaModel {
    /**
     * <p>The ID of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>c-7d2a745b412b4601b2d47f6a768d****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponseBody self = new CreateCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public CreateCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
