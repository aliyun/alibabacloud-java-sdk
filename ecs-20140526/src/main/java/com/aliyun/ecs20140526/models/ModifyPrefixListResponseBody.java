// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListResponseBody self = new ModifyPrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
