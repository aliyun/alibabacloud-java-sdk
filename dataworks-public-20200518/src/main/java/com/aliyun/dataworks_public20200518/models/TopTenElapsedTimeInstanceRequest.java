// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static TopTenElapsedTimeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TopTenElapsedTimeInstanceRequest self = new TopTenElapsedTimeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TopTenElapsedTimeInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
