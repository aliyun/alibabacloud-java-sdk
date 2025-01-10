// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssociateVpdCidrBlockRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The additional CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    /**
     * <p>The ID of the Lingjun CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-aof7dat1</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static UnAssociateVpdCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateVpdCidrBlockRequest self = new UnAssociateVpdCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public UnAssociateVpdCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnAssociateVpdCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public UnAssociateVpdCidrBlockRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
