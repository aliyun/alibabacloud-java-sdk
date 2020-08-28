// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    public String forwardEntryId;

    public static CreateForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponse self = new CreateForwardEntryResponse();
        return TeaModel.build(map, self);
    }

}
