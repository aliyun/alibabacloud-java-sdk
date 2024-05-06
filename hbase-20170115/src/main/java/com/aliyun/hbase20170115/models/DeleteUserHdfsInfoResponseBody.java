// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DeleteUserHdfsInfoResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserHdfsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserHdfsInfoResponseBody self = new DeleteUserHdfsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserHdfsInfoResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUserHdfsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
