// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAddressResponseBody extends TeaModel {
    /**
     * <p>222</p>
     */
    @NameInMap("ImportAddress")
    public GetAddressResp importAddress;

    public static GetAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddressResponseBody self = new GetAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddressResponseBody setImportAddress(GetAddressResp importAddress) {
        this.importAddress = importAddress;
        return this;
    }
    public GetAddressResp getImportAddress() {
        return this.importAddress;
    }

}
