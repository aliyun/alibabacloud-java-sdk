// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    public static TopTenErrorTimesInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceRequest self = new TopTenErrorTimesInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
