// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportListResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportListResponseBody self = new DescribeDcdnReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeDcdnReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
