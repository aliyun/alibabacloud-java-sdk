// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("ProjectName")
    public String projectName;

    public static GetQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerRequest self = new GetQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityFollowerRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public GetQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
