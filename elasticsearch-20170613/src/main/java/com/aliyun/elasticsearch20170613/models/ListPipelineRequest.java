// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineRequest extends TeaModel {
    @NameInMap("pipelineId")
    public String pipelineId;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRequest self = new ListPipelineRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListPipelineRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListPipelineRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
