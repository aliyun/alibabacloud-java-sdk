// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSlbRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("SlbType")
    public String slbType;

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
