// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the file that is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceFileResponseBody self = new CreateResourceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceFileResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateResourceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
