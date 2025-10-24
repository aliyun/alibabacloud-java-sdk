// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodesStatusResponseBody extends TeaModel {
    /**
     * <p>Error Message</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>B0699629-14FC-51E7-B49E-AAD83F6FEB60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReportNodesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportNodesStatusResponseBody self = new ReportNodesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportNodesStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReportNodesStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
