// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDiskWarningLineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08DF8283-D290-4107-931E-7913D6D3480D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The disk capacity alert threshold. For example, if the value is 75, an alert is triggered when disk usage exceeds 75%. If no value is returned, the user has not configured this parameter, and the system default value is 80%.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("WarningLine")
    public String warningLine;

    public static DescribeDiskWarningLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskWarningLineResponseBody self = new DescribeDiskWarningLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskWarningLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskWarningLineResponseBody setWarningLine(String warningLine) {
        this.warningLine = warningLine;
        return this;
    }
    public String getWarningLine() {
        return this.warningLine;
    }

}
