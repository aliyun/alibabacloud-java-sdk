// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInvitationListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeInvitationListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvitationListRequest self = new DescribeInvitationListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvitationListRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
