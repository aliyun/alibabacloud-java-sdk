// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSTBServiceProvidersRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("Province")
    public String province;

    public static ListSTBServiceProvidersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSTBServiceProvidersRequest self = new ListSTBServiceProvidersRequest();
        return TeaModel.build(map, self);
    }

    public ListSTBServiceProvidersRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ListSTBServiceProvidersRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
