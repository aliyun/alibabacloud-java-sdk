// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-lianmenyumingyi-hc5d1bwl****</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static DescribeConsortiumMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumMembersRequest self = new DescribeConsortiumMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumMembersRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeConsortiumMembersRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
