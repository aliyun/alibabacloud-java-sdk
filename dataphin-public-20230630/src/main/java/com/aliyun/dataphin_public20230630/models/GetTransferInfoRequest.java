// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTransferInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProposalId")
    public Long proposalId;

    public static GetTransferInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransferInfoRequest self = new GetTransferInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTransferInfoRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetTransferInfoRequest setProposalId(Long proposalId) {
        this.proposalId = proposalId;
        return this;
    }
    public Long getProposalId() {
        return this.proposalId;
    }

}
