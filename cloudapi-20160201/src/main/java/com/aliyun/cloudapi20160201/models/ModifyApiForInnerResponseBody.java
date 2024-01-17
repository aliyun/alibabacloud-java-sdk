// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiForInnerResponseBody self = new ModifyApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
