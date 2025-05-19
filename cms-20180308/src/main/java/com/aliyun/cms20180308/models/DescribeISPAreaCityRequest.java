// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeISPAreaCityRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("Isp")
    public String isp;

    public static DescribeISPAreaCityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeISPAreaCityRequest self = new DescribeISPAreaCityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeISPAreaCityRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeISPAreaCityRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

}
