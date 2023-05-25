// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponseBody self = new ModifyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
