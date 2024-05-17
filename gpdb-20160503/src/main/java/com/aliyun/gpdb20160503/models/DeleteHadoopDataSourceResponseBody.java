// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteHadoopDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHadoopDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHadoopDataSourceResponseBody self = new DeleteHadoopDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHadoopDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
