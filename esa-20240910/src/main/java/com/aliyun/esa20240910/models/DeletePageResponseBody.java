// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeletePageResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom error page.<a href="~~2850223~~"></a></p>
     * 
     * <strong>example:</strong>
     * <p>50000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePageResponseBody self = new DeletePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePageResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeletePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
