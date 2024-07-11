// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteServerlessClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46950E74-59C4-4E3E-9B38-A33B*********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServerlessClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerlessClusterResponseBody self = new DeleteServerlessClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServerlessClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
