// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskResponseBody self = new CreateDataQualityEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataQualityEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
