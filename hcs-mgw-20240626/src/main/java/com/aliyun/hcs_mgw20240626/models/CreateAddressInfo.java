// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAddressInfo extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressDetail")
    public AddressDetail addressDetail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <your-address-name>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static CreateAddressInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateAddressInfo self = new CreateAddressInfo();
        return TeaModel.build(map, self);
    }

    public CreateAddressInfo setAddressDetail(AddressDetail addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public AddressDetail getAddressDetail() {
        return this.addressDetail;
    }

    public CreateAddressInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAddressInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
