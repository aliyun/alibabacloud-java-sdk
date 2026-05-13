// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVscResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DD38F-12VBW2-**EKX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>vsc-b*d31dq</p>
     */
    @NameInMap("VscId")
    public String vscId;

    public static CreateVscResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVscResponseBody self = new CreateVscResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVscResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVscResponseBody setVscId(String vscId) {
        this.vscId = vscId;
        return this;
    }
    public String getVscId() {
        return this.vscId;
    }

}
