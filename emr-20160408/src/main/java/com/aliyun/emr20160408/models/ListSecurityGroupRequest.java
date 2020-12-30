// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("DepositType")
    public String depositType;

    @NameInMap("ProductType")
    public String productType;

    public static ListSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupRequest self = new ListSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSecurityGroupRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ListSecurityGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListSecurityGroupRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ListSecurityGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
