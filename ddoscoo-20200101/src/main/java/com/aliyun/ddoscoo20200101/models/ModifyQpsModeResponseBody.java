// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyQpsModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>48859E14-A9FB-4100-99FF-AAB75CA46776</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyQpsModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQpsModeResponseBody self = new ModifyQpsModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQpsModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
