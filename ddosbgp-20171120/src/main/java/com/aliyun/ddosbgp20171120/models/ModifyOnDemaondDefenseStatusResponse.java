// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class ModifyOnDemaondDefenseStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyOnDemaondDefenseStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnDemaondDefenseStatusResponse self = new ModifyOnDemaondDefenseStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOnDemaondDefenseStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
