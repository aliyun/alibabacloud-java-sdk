// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("category")
    public String category;

    public static ListPipelineJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobsRequest self = new ListPipelineJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
