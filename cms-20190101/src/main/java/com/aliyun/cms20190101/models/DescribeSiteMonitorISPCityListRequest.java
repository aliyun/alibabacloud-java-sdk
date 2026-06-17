// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListRequest extends TeaModel {
    /**
     * <p>The name or ID of the city where the carrier detection point resides.</p>
     * <blockquote>
     * <p>Fuzzy match is supported for city names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Guiyang</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Specifies whether to query IPv4 probes. Valid values:</p>
     * <ul>
     * <li>true (default): Queries IPv4 probes.</li>
     * <li>false: Does not query IPv4 probes.</li>
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
     * <li>true (default): Queries IPv6 probes.</li>
     * <li>false: Does not query IPv6 probes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IPV6")
    public Boolean IPV6;

    /**
     * <p>The name or ID of the carrier detection point.</p>
     * <blockquote>
     * <p>Fuzzy match is supported for carrier names.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>China Unicom</p>
     */
    @NameInMap("Isp")
    public String isp;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return all detection points. Valid values:</p>
     * <ul>
     * <li>true (default): Returns all detection points.</li>
     * <li>false: Returns only available detection points.</li>
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
