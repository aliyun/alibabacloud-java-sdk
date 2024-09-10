// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListRequest extends TeaModel {
    /**
     * <p>The name or ID of the city.</p>
     * <blockquote>
     * <p>City names support fuzzy match.</p>
     * </blockquote>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Specifies whether to query IPv4 probes. Valid values:</p>
     * <ul>
     * <li>true (default): IPv4 probes are queried.</li>
     * <li>false: IPv4 probes are not queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IPV4")
    public Boolean IPV4;

    /**
     * <p>Specifies whether to query IPv6 probes. Valid values:</p>
     * <ul>
     * <li>true (default): IPv6 probes are queried.</li>
     * <li>false: IPv6 probes are not queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IPV6")
    public Boolean IPV6;

    /**
     * <p>The name or ID of the carrier.</p>
     * <blockquote>
     * <p>Carrier names support fuzzy match.</p>
     * </blockquote>
     */
    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return all detection points. Valid values:</p>
     * <ul>
     * <li>true (default): returns all detection points.</li>
     * <li>false: returns only available detection points.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
