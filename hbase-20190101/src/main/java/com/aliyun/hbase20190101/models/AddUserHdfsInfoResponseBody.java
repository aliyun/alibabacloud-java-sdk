// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FB0B7918-198C-46A8-AB9B-FE15403B1F0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserHdfsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserHdfsInfoResponseBody self = new AddUserHdfsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserHdfsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
