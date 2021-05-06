// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyInstanceMemberAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMemberAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMemberAttributesResponseBody self = new ModifyInstanceMemberAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMemberAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
