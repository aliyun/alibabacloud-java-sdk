// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAddressRequest extends TeaModel {
    /**
     * <p>The details for creating the data address.</p>
     */
    @NameInMap("ImportAddress")
    public CreateAddressInfo importAddress;

    public static CreateAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAddressRequest self = new CreateAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateAddressRequest setImportAddress(CreateAddressInfo importAddress) {
        this.importAddress = importAddress;
        return this;
    }
    public CreateAddressInfo getImportAddress() {
        return this.importAddress;
    }

}
