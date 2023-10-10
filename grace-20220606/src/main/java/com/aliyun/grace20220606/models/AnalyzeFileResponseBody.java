// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class AnalyzeFileResponseBody extends TeaModel {
    @NameInMap("fileName")
    public String fileName;

    @NameInMap("requestId")
    public String requestId;

    public static AnalyzeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeFileResponseBody self = new AnalyzeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeFileResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AnalyzeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
