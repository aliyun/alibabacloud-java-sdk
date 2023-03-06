// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeRequest extends TeaModel {
    /**
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static ModifyInstanceMaintainTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeRequest self = new ModifyInstanceMaintainTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceMaintainTimeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
