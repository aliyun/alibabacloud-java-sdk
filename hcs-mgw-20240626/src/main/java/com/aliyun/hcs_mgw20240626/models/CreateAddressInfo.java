// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateAddressInfo extends TeaModel {
    /**
     * <p>The details of the data address.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressDetail")
    public AddressDetail addressDetail;

    /**
     * <p>The name of the data address.\
     * The name can contain lowercase letters, digits, hyphens (-), and underscores (<em>). The name must be 3 to 63 characters in length. The name is case-sensitive and encoded in UTF-8. The name cannot start with a hyphen (-) or an underscore (</em>). You must specify a name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tags in the key:value format.\
     * The value can contain letters, digits, hyphens (-), underscores (_), and commas (,). The value can be up to 1,024 characters in length.</p>
     * 
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
