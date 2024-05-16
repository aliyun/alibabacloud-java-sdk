// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSuccessInstanceTrendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetSuccessInstanceTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuccessInstanceTrendRequest self = new GetSuccessInstanceTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetSuccessInstanceTrendRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
