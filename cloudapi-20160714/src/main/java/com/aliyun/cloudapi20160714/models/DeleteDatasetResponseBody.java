// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>048C8EFB-528F-5E97-8A3D-D17B********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetResponseBody self = new DeleteDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
