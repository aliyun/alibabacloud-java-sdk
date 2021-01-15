// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdatePhysicalSpaceRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

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

    public static UpdatePhysicalSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhysicalSpaceRequest self = new UpdatePhysicalSpaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhysicalSpaceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdatePhysicalSpaceRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public UpdatePhysicalSpaceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdatePhysicalSpaceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public UpdatePhysicalSpaceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdatePhysicalSpaceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
