// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryResponse self = new DeleteForwardEntryResponse();
        return TeaModel.build(map, self);
    }

}
