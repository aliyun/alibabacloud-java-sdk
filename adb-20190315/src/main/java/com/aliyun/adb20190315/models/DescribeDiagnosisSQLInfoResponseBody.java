// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @NameInMap("DiagnosisSQLInfo")
    public String diagnosisSQLInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosisSQLInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoResponseBody self = new DescribeDiagnosisSQLInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoResponseBody setDiagnosisSQLInfo(String diagnosisSQLInfo) {
        this.diagnosisSQLInfo = diagnosisSQLInfo;
        return this;
    }
    public String getDiagnosisSQLInfo() {
        return this.diagnosisSQLInfo;
    }

    public DescribeDiagnosisSQLInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
