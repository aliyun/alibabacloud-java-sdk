// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceErrorRankRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetInstanceErrorRankRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceErrorRankRequest self = new GetInstanceErrorRankRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceErrorRankRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
