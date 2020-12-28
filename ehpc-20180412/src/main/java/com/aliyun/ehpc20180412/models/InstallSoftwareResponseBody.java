// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InstallSoftwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InstallSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallSoftwareResponseBody self = new InstallSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
