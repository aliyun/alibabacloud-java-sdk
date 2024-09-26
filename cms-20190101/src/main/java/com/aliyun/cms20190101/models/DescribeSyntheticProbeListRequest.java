// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSyntheticProbeListRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IdcProbe")
    public Boolean idcProbe;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ipv4")
    public Boolean ipv4;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Ipv6")
    public Boolean ipv6;

    @NameInMap("Isp")
    public String isp;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LmProbe")
    public Boolean lmProbe;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MbProbe")
    public Boolean mbProbe;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ViewAll")
    public Boolean viewAll;

    public static DescribeSyntheticProbeListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyntheticProbeListRequest self = new DescribeSyntheticProbeListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyntheticProbeListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSyntheticProbeListRequest setIdcProbe(Boolean idcProbe) {
        this.idcProbe = idcProbe;
        return this;
    }
    public Boolean getIdcProbe() {
        return this.idcProbe;
    }

    public DescribeSyntheticProbeListRequest setIpv4(Boolean ipv4) {
        this.ipv4 = ipv4;
        return this;
    }
    public Boolean getIpv4() {
        return this.ipv4;
    }

    public DescribeSyntheticProbeListRequest setIpv6(Boolean ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public Boolean getIpv6() {
        return this.ipv6;
    }

    public DescribeSyntheticProbeListRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeSyntheticProbeListRequest setLmProbe(Boolean lmProbe) {
        this.lmProbe = lmProbe;
        return this;
    }
    public Boolean getLmProbe() {
        return this.lmProbe;
    }

    public DescribeSyntheticProbeListRequest setMbProbe(Boolean mbProbe) {
        this.mbProbe = mbProbe;
        return this;
    }
    public Boolean getMbProbe() {
        return this.mbProbe;
    }

    public DescribeSyntheticProbeListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSyntheticProbeListRequest setViewAll(Boolean viewAll) {
        this.viewAll = viewAll;
        return this;
    }
    public Boolean getViewAll() {
        return this.viewAll;
    }

}
