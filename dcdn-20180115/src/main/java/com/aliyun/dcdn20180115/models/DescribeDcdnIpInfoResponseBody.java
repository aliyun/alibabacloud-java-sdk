// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionEname")
    public String regionEname;

    @NameInMap("Region")
    public String region;

    @NameInMap("IspEname")
    public String ispEname;

    @NameInMap("DcdnIp")
    public String dcdnIp;

    @NameInMap("ISP")
    public String ISP;

    public static DescribeDcdnIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpInfoResponseBody self = new DescribeDcdnIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnIpInfoResponseBody setRegionEname(String regionEname) {
        this.regionEname = regionEname;
        return this;
    }
    public String getRegionEname() {
        return this.regionEname;
    }

    public DescribeDcdnIpInfoResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDcdnIpInfoResponseBody setIspEname(String ispEname) {
        this.ispEname = ispEname;
        return this;
    }
    public String getIspEname() {
        return this.ispEname;
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

}
