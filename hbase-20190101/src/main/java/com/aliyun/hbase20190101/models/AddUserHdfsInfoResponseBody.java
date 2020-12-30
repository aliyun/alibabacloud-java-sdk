// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoResponseBody extends TeaModel {
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
