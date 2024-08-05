// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDatasetItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FF433E09-663A-5F5D-9DBA-A611********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetItemResponseBody self = new DeleteDatasetItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
