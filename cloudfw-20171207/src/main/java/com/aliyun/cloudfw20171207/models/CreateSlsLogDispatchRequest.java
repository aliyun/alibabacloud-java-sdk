// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSlsLogDispatchRequest extends TeaModel {
    /**
     * <p>The region ID of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>The log retention period. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static CreateSlsLogDispatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsLogDispatchRequest self = new CreateSlsLogDispatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlsLogDispatchRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateSlsLogDispatchRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

}
