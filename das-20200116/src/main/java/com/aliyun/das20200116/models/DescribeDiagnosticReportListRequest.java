// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeDiagnosticReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListRequest self = new DescribeDiagnosticReportListRequest();
        return TeaModel.build(map, self);
    }

}
