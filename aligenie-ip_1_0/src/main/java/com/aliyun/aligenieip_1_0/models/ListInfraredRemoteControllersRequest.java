// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListInfraredRemoteControllersRequest extends TeaModel {
    @NameInMap("Brand")
    public String brand;

    @NameInMap("Category")
    public String category;

    @NameInMap("City")
    public String city;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Province")
    public String province;

    @NameInMap("ServiceProvider")
    public String serviceProvider;

    public static ListInfraredRemoteControllersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInfraredRemoteControllersRequest self = new ListInfraredRemoteControllersRequest();
        return TeaModel.build(map, self);
    }

    public ListInfraredRemoteControllersRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public ListInfraredRemoteControllersRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListInfraredRemoteControllersRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ListInfraredRemoteControllersRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListInfraredRemoteControllersRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ListInfraredRemoteControllersRequest setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }
    public String getServiceProvider() {
        return this.serviceProvider;
    }

}
