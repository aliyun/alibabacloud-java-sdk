// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddUserHdfsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserHdfsInfoResponseBody self = new AddUserHdfsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserHdfsInfoResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddUserHdfsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
