// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyUserWhiteListValueByTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserWhiteListValueByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWhiteListValueByTypeResponseBody self = new ModifyUserWhiteListValueByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserWhiteListValueByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
