// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumChaincodesRequest extends TeaModel {
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

    public static DescribeConsortiumChaincodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumChaincodesRequest self = new DescribeConsortiumChaincodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumChaincodesRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeConsortiumChaincodesRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
