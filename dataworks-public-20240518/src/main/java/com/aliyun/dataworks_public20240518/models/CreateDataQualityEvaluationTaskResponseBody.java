// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2d9ce-38ef-4923-baf6-391a7e656</p>
     */
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
