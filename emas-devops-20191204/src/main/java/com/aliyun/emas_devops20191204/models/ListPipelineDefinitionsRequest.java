// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineDefinitionsRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("PipelineScope")
    public String pipelineScope;

    @NameInMap("Source")
    public String source;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    public static ListPipelineDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineDefinitionsRequest self = new ListPipelineDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineDefinitionsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListPipelineDefinitionsRequest setPipelineScope(String pipelineScope) {
        this.pipelineScope = pipelineScope;
        return this;
    }
    public String getPipelineScope() {
        return this.pipelineScope;
    }

    public ListPipelineDefinitionsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListPipelineDefinitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineDefinitionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
