// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteHaVipsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHaVipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipsResponseBody self = new DeleteHaVipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
