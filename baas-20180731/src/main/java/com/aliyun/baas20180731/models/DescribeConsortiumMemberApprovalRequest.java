// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumMemberApprovalRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeConsortiumMemberApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumMemberApprovalRequest self = new DescribeConsortiumMemberApprovalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumMemberApprovalRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeConsortiumMemberApprovalRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
