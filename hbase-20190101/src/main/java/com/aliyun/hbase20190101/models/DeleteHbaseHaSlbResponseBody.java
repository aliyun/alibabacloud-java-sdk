// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHbaseHaSlbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHbaseHaSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHbaseHaSlbResponseBody self = new DeleteHbaseHaSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHbaseHaSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
