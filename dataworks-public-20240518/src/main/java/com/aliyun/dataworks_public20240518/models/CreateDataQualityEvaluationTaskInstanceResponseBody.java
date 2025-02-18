// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityEvaluationTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the data quality monitoring instance.</p>
     * 
     * <strong>example:</strong>
     * <p>22130</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ecb967ec-c137-48****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityEvaluationTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityEvaluationTaskInstanceResponseBody self = new CreateDataQualityEvaluationTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityEvaluationTaskInstanceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataQualityEvaluationTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
