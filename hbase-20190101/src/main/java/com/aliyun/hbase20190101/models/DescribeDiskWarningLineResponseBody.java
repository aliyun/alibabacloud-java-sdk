// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDiskWarningLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
