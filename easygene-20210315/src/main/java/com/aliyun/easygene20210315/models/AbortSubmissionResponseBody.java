// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortSubmissionResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("RequestId")
    public String requestId;

    public static AbortSubmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortSubmissionResponseBody self = new AbortSubmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortSubmissionResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public AbortSubmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
