// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class RefundVccRequest extends TeaModel {
    /**
     * <p>Region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Lingjun Connection ID</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    public static RefundVccRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundVccRequest self = new RefundVccRequest();
        return TeaModel.build(map, self);
    }

    public RefundVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RefundVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

}
