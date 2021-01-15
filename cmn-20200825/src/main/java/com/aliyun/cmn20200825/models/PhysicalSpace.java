// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class PhysicalSpace extends TeaModel {
    // 具体所在地址
    @NameInMap("Address")
    public String address;

    // 所属城市
    @NameInMap("City")
    public String city;

    // 所属国家
    @NameInMap("Country")
    public String country;

    // 所属省份
    @NameInMap("Province")
    public String province;

    // 物理空间ID
    @NameInMap("SpaceId")
    public String spaceId;

    // 物理空间名称
    @NameInMap("SpaceName")
    public String spaceName;

    public static PhysicalSpace build(java.util.Map<String, ?> map) throws Exception {
        PhysicalSpace self = new PhysicalSpace();
        return TeaModel.build(map, self);
    }

    public PhysicalSpace setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public PhysicalSpace setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public PhysicalSpace setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public PhysicalSpace setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public PhysicalSpace setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public PhysicalSpace setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

}
