// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssociateVpdCidrBlockRequest extends TeaModel {
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
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("SecondaryCidrBlock")
    public String secondaryCidrBlock;

    /**
     * <p>The ID of the Lingjun CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-omqutbff</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static AssociateVpdCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpdCidrBlockRequest self = new AssociateVpdCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public AssociateVpdCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateVpdCidrBlockRequest setSecondaryCidrBlock(String secondaryCidrBlock) {
        this.secondaryCidrBlock = secondaryCidrBlock;
        return this;
    }
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public AssociateVpdCidrBlockRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
