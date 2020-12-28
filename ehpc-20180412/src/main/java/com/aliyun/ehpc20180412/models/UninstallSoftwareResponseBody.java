// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwareResponseBody self = new UninstallSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
