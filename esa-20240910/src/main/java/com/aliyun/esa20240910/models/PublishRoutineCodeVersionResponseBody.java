// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishRoutineCodeVersionResponseBody extends TeaModel {
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishRoutineCodeVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRoutineCodeVersionResponseBody self = new PublishRoutineCodeVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRoutineCodeVersionResponseBody setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public PublishRoutineCodeVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
