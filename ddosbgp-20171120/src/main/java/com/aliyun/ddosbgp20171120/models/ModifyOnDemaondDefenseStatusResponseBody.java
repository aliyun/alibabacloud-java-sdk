// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class ModifyOnDemaondDefenseStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOnDemaondDefenseStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnDemaondDefenseStatusResponseBody self = new ModifyOnDemaondDefenseStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOnDemaondDefenseStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
