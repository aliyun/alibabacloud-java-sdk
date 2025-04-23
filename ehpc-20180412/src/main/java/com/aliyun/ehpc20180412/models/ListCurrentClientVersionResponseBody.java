// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCurrentClientVersionResponseBody extends TeaModel {
    /**
     * <p>The latest version number of ehpcutil.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCurrentClientVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentClientVersionResponseBody self = new ListCurrentClientVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCurrentClientVersionResponseBody setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ListCurrentClientVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
