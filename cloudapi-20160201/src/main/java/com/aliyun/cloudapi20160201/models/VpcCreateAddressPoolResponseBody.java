// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcCreateAddressPoolResponseBody extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("RequestId")
    public String requestId;

    public static VpcCreateAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcCreateAddressPoolResponseBody self = new VpcCreateAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcCreateAddressPoolResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public VpcCreateAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
