// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CommitRoutineStagingCodeResponseBody extends TeaModel {
    /**
     * <p>The version number of the newly generated code.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
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
