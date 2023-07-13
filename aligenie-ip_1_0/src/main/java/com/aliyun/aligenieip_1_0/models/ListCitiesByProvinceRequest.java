// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCitiesByProvinceRequest extends TeaModel {
    @NameInMap("Province")
    public String province;

    public static ListCitiesByProvinceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCitiesByProvinceRequest self = new ListCitiesByProvinceRequest();
        return TeaModel.build(map, self);
    }

    public ListCitiesByProvinceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
