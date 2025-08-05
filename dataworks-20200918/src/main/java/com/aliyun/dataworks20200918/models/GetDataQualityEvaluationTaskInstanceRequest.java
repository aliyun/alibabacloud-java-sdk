// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataQualityEvaluationTaskInstanceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetDataQualityEvaluationTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityEvaluationTaskInstanceRequest self = new GetDataQualityEvaluationTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityEvaluationTaskInstanceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
