// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyStudioLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStudioLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStudioLayoutResponseBody self = new ModifyStudioLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStudioLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
