// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardAreaLimitSupportAreaRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ProvinceName")
    public String provinceName;

    @NameInMap("RegionId")
    public String regionId;

    public static ListCardAreaLimitSupportAreaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCardAreaLimitSupportAreaRequest self = new ListCardAreaLimitSupportAreaRequest();
        return TeaModel.build(map, self);
    }

    public ListCardAreaLimitSupportAreaRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListCardAreaLimitSupportAreaRequest setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getProvinceName() {
        return this.provinceName;
    }

    public ListCardAreaLimitSupportAreaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
