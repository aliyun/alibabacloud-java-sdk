// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2180AB96-57CF-1C68-9FEE-D60E547FD79C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketResponseBody self = new DeleteBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
