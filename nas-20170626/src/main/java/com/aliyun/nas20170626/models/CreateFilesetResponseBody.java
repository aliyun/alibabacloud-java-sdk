// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetResponseBody extends TeaModel {
    /**
     * <p>The fileset ID.</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFilesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFilesetResponseBody self = new CreateFilesetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFilesetResponseBody setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

    public CreateFilesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
