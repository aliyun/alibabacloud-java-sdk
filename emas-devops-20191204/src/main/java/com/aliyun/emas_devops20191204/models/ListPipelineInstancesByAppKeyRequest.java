// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineInstancesByAppKeyRequest extends TeaModel {
    @NameInMap("PipelineType")
    @Validation(required = true)
    public String pipelineType;

    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    public static ListPipelineInstancesByAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineInstancesByAppKeyRequest self = new ListPipelineInstancesByAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineInstancesByAppKeyRequest setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
        return this;
    }
    public String getPipelineType() {
        return this.pipelineType;
    }

    public ListPipelineInstancesByAppKeyRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListPipelineInstancesByAppKeyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineInstancesByAppKeyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
