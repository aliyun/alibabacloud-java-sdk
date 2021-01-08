// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class TransferPipelineOwnerRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("NewOwnerId")
    public String newOwnerId;

    public static TransferPipelineOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferPipelineOwnerRequest self = new TransferPipelineOwnerRequest();
        return TeaModel.build(map, self);
    }

    public TransferPipelineOwnerRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public TransferPipelineOwnerRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public TransferPipelineOwnerRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public TransferPipelineOwnerRequest setNewOwnerId(String newOwnerId) {
        this.newOwnerId = newOwnerId;
        return this;
    }
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

}
