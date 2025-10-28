// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbRequest extends TeaModel {
    /**
     * <p>The type of the IP addresses. Valid values:</p>
     * <ul>
     * <li>Internet: Users can connect to the SLB instance over the Internet.</li>
     * <li>Intranet: Users can connect to the SLB instance over the internal network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <ul>
     * <li>clb: Classic Load Balancer (CLB)</li>
     * <li>alb: Application Load Balancer (ALB)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("SlbType")
    public String slbType;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1f90rfybszjogyw****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlbRequest self = new ListSlbRequest();
        return TeaModel.build(map, self);
    }

    public ListSlbRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ListSlbRequest setSlbType(String slbType) {
        this.slbType = slbType;
        return this;
    }
    public String getSlbType() {
        return this.slbType;
    }

    public ListSlbRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
