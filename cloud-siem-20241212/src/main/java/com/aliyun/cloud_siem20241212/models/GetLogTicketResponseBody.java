// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetLogTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>*******。</p>
     */
    @NameInMap("LogTicket")
    public String logTicket;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLogTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogTicketResponseBody self = new GetLogTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogTicketResponseBody setLogTicket(String logTicket) {
        this.logTicket = logTicket;
        return this;
    }
    public String getLogTicket() {
        return this.logTicket;
    }

    public GetLogTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
