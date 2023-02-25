// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportResponseBody extends TeaModel {
    /**
     * <p>The content of the operations report.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportResponseBody self = new DescribeDcdnReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeDcdnReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
