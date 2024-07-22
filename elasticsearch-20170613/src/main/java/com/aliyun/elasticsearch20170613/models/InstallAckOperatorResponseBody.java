// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallAckOperatorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFA88951-7A6F-4A8E-AB8F-2BB7132BA751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether ES-operator is installed. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static InstallAckOperatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAckOperatorResponseBody self = new InstallAckOperatorResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAckOperatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallAckOperatorResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
