// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GenerateCdnDiagnoseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/?id=xxxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/?id=xxxxxxx</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateCdnDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCdnDiagnoseResponseBody self = new GenerateCdnDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCdnDiagnoseResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GenerateCdnDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
