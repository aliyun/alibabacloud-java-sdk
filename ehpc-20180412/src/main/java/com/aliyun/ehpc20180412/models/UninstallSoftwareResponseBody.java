// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C84FB8EF-5580-4B82-9BDE-6657814C****</p>
     */
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
