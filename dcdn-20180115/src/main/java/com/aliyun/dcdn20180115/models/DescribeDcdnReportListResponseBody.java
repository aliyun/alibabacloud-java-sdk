// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportListResponseBody extends TeaModel {
    /**
     * <p>The information about the operations report.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;: [{&quot;reportId&quot;:2,&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;DomainPvUv&quot;,&quot;format&quot;:&quot;chart&quot;,&quot;shape&quot;:&quot;line&quot;,&quot;xAxis&quot;:&quot;ds&quot;,&quot;yAxis&quot;:&quot;cnt&quot;,&quot;legend&quot;:&quot;cnt_type&quot;,&quot;header&quot;:[&quot;ds&quot;,&quot;cnt_type&quot;,&quot;cnt&quot;]}}}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
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
