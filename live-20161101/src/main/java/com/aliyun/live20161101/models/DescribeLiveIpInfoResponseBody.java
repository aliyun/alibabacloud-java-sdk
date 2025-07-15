// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveIpInfoResponseBody extends TeaModel {
    /**
     * <p>The Chinese name of the ISP.</p>
     * 
     * <strong>example:</strong>
     * <p>ChinaTelecom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The English name of the Internet service provider (ISP).</p>
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
     * <p>China-Guizhou-guiyang</p>
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

    public static DescribeLiveIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveIpInfoResponseBody self = new DescribeLiveIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveIpInfoResponseBody setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeLiveIpInfoResponseBody setIspEname(String ispEname) {
        this.ispEname = ispEname;
        return this;
    }
    public String getIspEname() {
        return this.ispEname;
    }

    public DescribeLiveIpInfoResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveIpInfoResponseBody setRegionEname(String regionEname) {
        this.regionEname = regionEname;
        return this;
    }
    public String getRegionEname() {
        return this.regionEname;
    }

    public DescribeLiveIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
