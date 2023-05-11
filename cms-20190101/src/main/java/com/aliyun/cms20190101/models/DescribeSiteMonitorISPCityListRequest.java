// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListRequest extends TeaModel {
    /**
     * <p>The name of the country.</p>
     * <br>
     * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The name of the area.</p>
     */
    @NameInMap("IPV4")
    public Boolean IPV4;

    /**
     * <p>The name of the area.</p>
     * <br>
     * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
     */
    @NameInMap("IPV6")
    public Boolean IPV6;

    /**
     * <p>The name of the province.</p>
     */
    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address pool.</p>
     */
    @NameInMap("ViewAll")
    public Boolean viewAll;

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

    public DescribeSiteMonitorISPCityListRequest setViewAll(Boolean viewAll) {
        this.viewAll = viewAll;
        return this;
    }
    public Boolean getViewAll() {
        return this.viewAll;
    }

}
