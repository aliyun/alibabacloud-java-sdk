// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceRequest extends TeaModel {
    // 物理空间名称
    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    // 所属国家
    @NameInMap("Country")
    public String country;

    // 所属省份
    @NameInMap("Province")
    public String province;

    // 所属城市
    @NameInMap("City")
    public String city;

    // 具体地址
    @NameInMap("Address")
    public String address;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreatePhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceRequest self = new CreatePhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public CreatePhysicalSpaceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreatePhysicalSpaceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public CreatePhysicalSpaceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreatePhysicalSpaceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreatePhysicalSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
