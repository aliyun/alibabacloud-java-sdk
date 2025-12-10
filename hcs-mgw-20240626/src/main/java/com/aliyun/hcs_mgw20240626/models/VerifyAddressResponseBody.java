// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class VerifyAddressResponseBody extends TeaModel {
    /**
     * <p>The details for verifying the data address.</p>
     */
    @NameInMap("VerifyAddressResponse")
    public VerifyAddressResp verifyAddressResponse;

    public static VerifyAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyAddressResponseBody self = new VerifyAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyAddressResponseBody setVerifyAddressResponse(VerifyAddressResp verifyAddressResponse) {
        this.verifyAddressResponse = verifyAddressResponse;
        return this;
    }
    public VerifyAddressResp getVerifyAddressResponse() {
        return this.verifyAddressResponse;
    }

}
