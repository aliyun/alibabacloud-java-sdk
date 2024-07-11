// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteUserHdfsInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50373857-C47B-4B64-9332-D0B5280B59EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserHdfsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserHdfsInfoResponseBody self = new DeleteUserHdfsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserHdfsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
