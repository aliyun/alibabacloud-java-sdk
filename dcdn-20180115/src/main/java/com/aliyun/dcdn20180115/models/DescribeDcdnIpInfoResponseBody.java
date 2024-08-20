// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the specified IP address is assigned to an Alibaba Cloud DCDN POP.</p>
     * <ul>
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("DcdnIp")
    public String dcdnIp;

    /**
     * <p>The ISP to which the specified IP address belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>China Telecom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The name of the Internet service provider (ISP).</p>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("IspEname")
    public String ispEname;

    /**
     * <p>The Chinese name of the region.</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * <p> The maximum number of times that users can call this operation per second is 50.</p>
     * </blockquote>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The English name of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>China-Guizhou-guiyang</p>
     */
    @NameInMap("RegionEname")
    public String regionEname;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1B1D0EE7-9559-489D-BC4E-279495EB8FB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpInfoResponseBody self = new DescribeDcdnIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpInfoResponseBody setDcdnIp(String dcdnIp) {
        this.dcdnIp = dcdnIp;
        return this;
    }
    public String getDcdnIp() {
        return this.dcdnIp;
    }

    public DescribeDcdnIpInfoResponseBody setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeDcdnIpInfoResponseBody setIspEname(String ispEname) {
        this.ispEname = ispEname;
        return this;
    }
    public String getIspEname() {
        return this.ispEname;
    }

    public DescribeDcdnIpInfoResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDcdnIpInfoResponseBody setRegionEname(String regionEname) {
        this.regionEname = regionEname;
        return this;
    }
    public String getRegionEname() {
        return this.regionEname;
    }

    public DescribeDcdnIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
