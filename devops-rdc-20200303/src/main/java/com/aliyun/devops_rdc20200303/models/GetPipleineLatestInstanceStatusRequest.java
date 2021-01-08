// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipleineLatestInstanceStatusRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    public static GetPipleineLatestInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipleineLatestInstanceStatusRequest self = new GetPipleineLatestInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPipleineLatestInstanceStatusRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipleineLatestInstanceStatusRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipleineLatestInstanceStatusRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
