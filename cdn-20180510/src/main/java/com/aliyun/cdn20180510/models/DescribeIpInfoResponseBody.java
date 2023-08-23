// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIpInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the IP address belongs to an Alibaba Cloud CDN POP.</p>
     * <p>*   **True**:Yes.</p>
     * <p>*   **False**:No.</p>
     */
    @NameInMap("CdnIp")
    public String cdnIp;

    /**
     * <p>The name of the ISP in Chinese.</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The name of the ISP.</p>
     */
    @NameInMap("IspEname")
    public String ispEname;

    /**
     * <p>The name of the region in Chinese.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The name of the region.</p>
     */
    @NameInMap("RegionEname")
    public String regionEname;

    /**
     * <p>The ID of the request.</p>
     */
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
