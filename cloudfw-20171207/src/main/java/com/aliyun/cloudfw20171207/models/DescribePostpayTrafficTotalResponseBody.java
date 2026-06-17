// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficTotalResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>826B6280-9704-5643-97B1-6B47AC3F027A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of assets that are protected by border firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalAssets")
    public Long totalAssets;

    /**
     * <p>For the subscription edition, this is the total billed elastic traffic after deductions are applied. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2320274874426</p>
     */
    @NameInMap("TotalBillTraffic")
    public Long totalBillTraffic;

    /**
     * <p>The total number of assets that are protected by Internet Border firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("TotalInternetAssets")
    public Long totalInternetAssets;

    /**
     * <p>The total traffic of the Internet Border. For the subscription edition, this is the total elastic traffic of the Internet Border. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2320274874426</p>
     */
    @NameInMap("TotalInternetTraffic")
    public Long totalInternetTraffic;

    /**
     * <p>The total number of assets that are protected by NAT border firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNatAssets")
    public Long totalNatAssets;

    /**
     * <p>The total traffic of the NAT border. For the subscription edition, this is the total elastic traffic of the NAT border. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>560646279</p>
     */
    @NameInMap("TotalNatTraffic")
    public Long totalNatTraffic;

    /**
     * <p>The total billed traffic for data leakage detection.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalSdlBillTraffic")
    public Long totalSdlBillTraffic;

    /**
     * <p>The total free traffic for data leakage detection.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalSdlFreeTraffic")
    public Long totalSdlFreeTraffic;

    /**
     * <p>The total traffic. For the subscription edition, this is the total elastic traffic. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2320274874426</p>
     */
    @NameInMap("TotalTraffic")
    public Long totalTraffic;

    /**
     * <p>The total number of assets that are protected by VPC border firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalVpcAssets")
    public Long totalVpcAssets;

    /**
     * <p>The total traffic of the VPC border. For the subscription edition, this is the total elastic traffic of the VPC border. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>2320274874426</p>
     */
    @NameInMap("TotalVpcTraffic")
    public Long totalVpcTraffic;

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

    public DescribePostpayTrafficTotalResponseBody setTotalBillTraffic(Long totalBillTraffic) {
        this.totalBillTraffic = totalBillTraffic;
        return this;
    }
    public Long getTotalBillTraffic() {
        return this.totalBillTraffic;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalInternetAssets(Long totalInternetAssets) {
        this.totalInternetAssets = totalInternetAssets;
        return this;
    }
    public Long getTotalInternetAssets() {
        return this.totalInternetAssets;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalInternetTraffic(Long totalInternetTraffic) {
        this.totalInternetTraffic = totalInternetTraffic;
        return this;
    }
    public Long getTotalInternetTraffic() {
        return this.totalInternetTraffic;
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

    public DescribePostpayTrafficTotalResponseBody setTotalSdlBillTraffic(Long totalSdlBillTraffic) {
        this.totalSdlBillTraffic = totalSdlBillTraffic;
        return this;
    }
    public Long getTotalSdlBillTraffic() {
        return this.totalSdlBillTraffic;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalSdlFreeTraffic(Long totalSdlFreeTraffic) {
        this.totalSdlFreeTraffic = totalSdlFreeTraffic;
        return this;
    }
    public Long getTotalSdlFreeTraffic() {
        return this.totalSdlFreeTraffic;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalTraffic(Long totalTraffic) {
        this.totalTraffic = totalTraffic;
        return this;
    }
    public Long getTotalTraffic() {
        return this.totalTraffic;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalVpcAssets(Long totalVpcAssets) {
        this.totalVpcAssets = totalVpcAssets;
        return this;
    }
    public Long getTotalVpcAssets() {
        return this.totalVpcAssets;
    }

    public DescribePostpayTrafficTotalResponseBody setTotalVpcTraffic(Long totalVpcTraffic) {
        this.totalVpcTraffic = totalVpcTraffic;
        return this;
    }
    public Long getTotalVpcTraffic() {
        return this.totalVpcTraffic;
    }

}
