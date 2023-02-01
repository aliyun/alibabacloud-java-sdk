// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupVpcWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiGroupVpcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupVpcWhitelistResponseBody self = new ModifyApiGroupVpcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupVpcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
