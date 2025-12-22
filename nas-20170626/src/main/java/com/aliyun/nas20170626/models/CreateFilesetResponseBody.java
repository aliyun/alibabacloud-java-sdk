// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetResponseBody extends TeaModel {
    /**
     * <p>The fileset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
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
