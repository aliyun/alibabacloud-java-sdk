// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    @NameInMap("Reason")
    @Validation(required = true)
    public String reason;

    @NameInMap("BatchType")
    @Validation(required = true)
    public String batchType;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeBatchResultCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountResponse self = new DescribeBatchResultCountResponse();
        return TeaModel.build(map, self);
    }

}
