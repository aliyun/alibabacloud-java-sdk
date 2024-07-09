// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportResponseBody extends TeaModel {
    /**
     * <p>The content of the operations report.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;:[{&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;TopUrlByAcc&quot;,&quot;format&quot;:&quot;table&quot;,&quot;shape&quot;:&quot;&quot;,&quot;header&quot;:[&quot;url&quot;,&quot;traf&quot;,&quot;traf_rate&quot;,&quot;acc&quot;,&quot;acc_rate&quot;]}},&quot;data&quot;:[{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;<a href="http://demo.com%22,%22traf_rate%22:%220.100%%22%7D,%7B%22acc%22:440,%22acc_rate%22:%220.200%%22,%22traf%22:22,%22url%22:%22http://demo.com%22,%22traf_rate%22:%220.100%%22%7D%5D%7D%5D%7D%7D">http://demo.com&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;},{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;http://demo.com&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;}]}]}}</a></p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportResponseBody self = new DescribeCdnReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeCdnReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
