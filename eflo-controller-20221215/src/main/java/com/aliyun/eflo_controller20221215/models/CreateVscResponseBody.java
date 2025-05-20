// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateVscResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Created VscId</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-001</p>
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
