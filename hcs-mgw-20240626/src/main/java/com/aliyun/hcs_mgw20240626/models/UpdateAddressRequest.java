// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateAddressRequest extends TeaModel {
    /**
     * <p>The details for updating the data address.</p>
     */
    @NameInMap("ImportAddress")
    public UpdateAddressInfo importAddress;

    public static UpdateAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddressRequest self = new UpdateAddressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAddressRequest setImportAddress(UpdateAddressInfo importAddress) {
        this.importAddress = importAddress;
        return this;
    }
    public UpdateAddressInfo getImportAddress() {
        return this.importAddress;
    }

}
