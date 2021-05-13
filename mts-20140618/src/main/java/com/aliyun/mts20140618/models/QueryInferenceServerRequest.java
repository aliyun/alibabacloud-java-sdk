// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceServerRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("CreateTime")
    public Long createTime;

    public static QueryInferenceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceServerRequest self = new QueryInferenceServerRequest();
        return TeaModel.build(map, self);
    }

    public QueryInferenceServerRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryInferenceServerRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public QueryInferenceServerRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
