// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CommitRoutineStagingCodeResponseBody extends TeaModel {
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CommitRoutineStagingCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitRoutineStagingCodeResponseBody self = new CommitRoutineStagingCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitRoutineStagingCodeResponseBody setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public CommitRoutineStagingCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
