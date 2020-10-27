// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttachmentAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceAttachmentAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttachmentAttributesResponse self = new ModifyInstanceAttachmentAttributesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttachmentAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
