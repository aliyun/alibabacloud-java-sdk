// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyAppForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppForInnerResponseBody self = new ModifyAppForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
