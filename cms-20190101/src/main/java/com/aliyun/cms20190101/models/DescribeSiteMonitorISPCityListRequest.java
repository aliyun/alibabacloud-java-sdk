// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("IPV4")
    public Boolean IPV4;

    @NameInMap("IPV6")
    public Boolean IPV6;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSiteMonitorISPCityListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorISPCityListRequest self = new DescribeSiteMonitorISPCityListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorISPCityListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSiteMonitorISPCityListRequest setIPV4(Boolean IPV4) {
        this.IPV4 = IPV4;
        return this;
    }
    public Boolean getIPV4() {
        return this.IPV4;
    }

    public DescribeSiteMonitorISPCityListRequest setIPV6(Boolean IPV6) {
        this.IPV6 = IPV6;
        return this;
    }
    public Boolean getIPV6() {
        return this.IPV6;
    }

    public DescribeSiteMonitorISPCityListRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeSiteMonitorISPCityListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
