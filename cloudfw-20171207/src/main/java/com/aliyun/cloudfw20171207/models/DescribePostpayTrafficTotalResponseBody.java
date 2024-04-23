// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficTotalResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the assets that are protected by the Internet firewall.</p>
     */
    @NameInMap("TotalAssets")
    public Long totalAssets;

    /**
     * <p>The total number of the assets that are protected by the NAT firewall.</p>
     */
    @NameInMap("TotalNatAssets")
    public Long totalNatAssets;

    /**
     * <p>The total traffic for the NAT firewall. Unit: bytes.</p>
     */
    @NameInMap("TotalNatTraffic")
    public Long totalNatTraffic;

    /**
     * <p>The total traffic for the Internet firewall. Unit: bytes.</p>
     */
    @NameInMap("TotalTraffic")
    public Long totalTraffic;

    public static DescribePostpayTrafficTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficTotalResponseBody self = new DescribePostpayTrafficTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalAssets(Long totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }
    public Long getTotalAssets() {
        return this.totalAssets;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalNatAssets(Long totalNatAssets) {
        this.totalNatAssets = totalNatAssets;
        return this;
    }
    public Long getTotalNatAssets() {
        return this.totalNatAssets;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalNatTraffic(Long totalNatTraffic) {
        this.totalNatTraffic = totalNatTraffic;
        return this;
    }
    public Long getTotalNatTraffic() {
        return this.totalNatTraffic;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalTraffic(Long totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public Long getTotalTraffic() {
        return this.totalTraffic;
    }

}
