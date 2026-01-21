// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SetAutoProtectNewAssetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAutoProtectNewAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAutoProtectNewAssetsResponseBody self = new SetAutoProtectNewAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAutoProtectNewAssetsResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public SetAutoProtectNewAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
