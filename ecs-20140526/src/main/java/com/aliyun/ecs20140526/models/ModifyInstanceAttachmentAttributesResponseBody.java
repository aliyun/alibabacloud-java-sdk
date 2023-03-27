// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttachmentAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAttachmentAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttachmentAttributesResponseBody self = new ModifyInstanceAttachmentAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttachmentAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
