// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDiskWarningLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>08DF8283-D290-4107-931E-7913D6D3480D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
