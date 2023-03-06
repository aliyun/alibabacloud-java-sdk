// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>pipeline_test</p>
     */
    @NameInMap("pipelineId")
    public String pipelineId;

    /**
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
