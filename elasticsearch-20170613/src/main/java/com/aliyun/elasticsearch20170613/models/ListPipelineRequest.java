// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineRequest extends TeaModel {
    /**
     * <p>The page number of the current page for a paged query. Valid values: 1 to 200. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The pipeline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pipeline_test</p>
     */
    @NameInMap("pipelineId")
    public String pipelineId;

    /**
     * <p>The number of pipelines per page for a paged query. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRequest self = new ListPipelineRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListPipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListPipelineRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
