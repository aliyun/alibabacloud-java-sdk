// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineInstancesByDefinitionRequest extends TeaModel {
    @NameInMap("PipelineDefinitionId")
    @Validation(required = true)
    public String pipelineDefinitionId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    public static ListPipelineInstancesByDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineInstancesByDefinitionRequest self = new ListPipelineInstancesByDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineInstancesByDefinitionRequest setPipelineDefinitionId(String pipelineDefinitionId) {
        this.pipelineDefinitionId = pipelineDefinitionId;
        return this;
    }
    public String getPipelineDefinitionId() {
        return this.pipelineDefinitionId;
    }

    public ListPipelineInstancesByDefinitionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineInstancesByDefinitionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
