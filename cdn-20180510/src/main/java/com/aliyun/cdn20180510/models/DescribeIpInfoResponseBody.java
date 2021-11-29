// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpInfoResponseBody extends TeaModel {
    @NameInMap("CdnIp")
    public String cdnIp;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("IspEname")
    public String ispEname;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionEname")
    public String regionEname;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpInfoResponseBody self = new DescribeIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpInfoResponseBody setCdnIp(String cdnIp) {
        this.cdnIp = cdnIp;
        return this;
    }
    public String getCdnIp() {
        return this.cdnIp;
    }

    public DescribeIpInfoResponseBody setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeIpInfoResponseBody setIspEname(String ispEname) {
        this.ispEname = ispEname;
        return this;
    }
    public String getIspEname() {
        return this.ispEname;
    }

    public DescribeIpInfoResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeIpInfoResponseBody setRegionEname(String regionEname) {
        this.regionEname = regionEname;
        return this;
    }
    public String getRegionEname() {
        return this.regionEname;
    }

    public DescribeIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
