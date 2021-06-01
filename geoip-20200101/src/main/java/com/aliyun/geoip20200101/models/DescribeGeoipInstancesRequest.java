// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstancesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeGeoipInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstancesRequest self = new DescribeGeoipInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
