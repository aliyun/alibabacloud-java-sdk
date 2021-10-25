// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCurrentClientVersionResponseBody extends TeaModel {
    @NameInMap("ClientVersion")
    public String clientVersion;

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
