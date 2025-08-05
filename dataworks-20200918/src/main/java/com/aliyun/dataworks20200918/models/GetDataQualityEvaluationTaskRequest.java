// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskRequest self = new GetDataQualityEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
