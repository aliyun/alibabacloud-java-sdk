// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyContainerAppAttributesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyContainerAppAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerAppAttributesResponseBody self = new ModifyContainerAppAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyContainerAppAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
