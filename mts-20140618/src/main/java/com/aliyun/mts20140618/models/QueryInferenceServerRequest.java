// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceServerRequest extends TeaModel {
    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("MaxPageSize")
    public Long maxPageSize;

    public static QueryInferenceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceServerRequest self = new QueryInferenceServerRequest();
        return TeaModel.build(map, self);
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

    public QueryInferenceServerRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryInferenceServerRequest setMaxPageSize(Long maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }
    public Long getMaxPageSize() {
        return this.maxPageSize;
    }

}
