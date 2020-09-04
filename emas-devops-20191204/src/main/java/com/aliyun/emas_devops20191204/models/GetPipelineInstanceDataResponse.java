// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Long successCount;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    public static GetPipelineInstanceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceDataResponse self = new GetPipelineInstanceDataResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstanceDataResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetPipelineInstanceDataResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
