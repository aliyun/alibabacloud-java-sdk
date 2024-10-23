// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifySQAConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>494486CE-6F49-574E-B304-29127EA12E36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySQAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySQAConfigResponseBody self = new ModifySQAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySQAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
