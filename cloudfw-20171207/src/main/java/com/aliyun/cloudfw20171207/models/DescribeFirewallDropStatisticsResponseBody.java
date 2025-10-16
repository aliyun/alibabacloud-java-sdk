// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallDropStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AclDropCnt")
    public Long aclDropCnt;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("IpsDropCnt")
    public Long ipsDropCnt;

    /**
     * <strong>example:</strong>
     * <p>BEA1D173-D5DB-582E-9637-438D5CE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalDropCnt")
    public Long totalDropCnt;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VulnDropCnt")
    public Long vulnDropCnt;

    public static DescribeFirewallDropStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallDropStatisticsResponseBody self = new DescribeFirewallDropStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallDropStatisticsResponseBody setAclDropCnt(Long aclDropCnt) {
        this.aclDropCnt = aclDropCnt;
        return this;
    }
    public Long getAclDropCnt() {
        return this.aclDropCnt;
    }

    public DescribeFirewallDropStatisticsResponseBody setIpsDropCnt(Long ipsDropCnt) {
        this.ipsDropCnt = ipsDropCnt;
        return this;
    }
    public Long getIpsDropCnt() {
        return this.ipsDropCnt;
    }

    public DescribeFirewallDropStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallDropStatisticsResponseBody setTotalDropCnt(Long totalDropCnt) {
        this.totalDropCnt = totalDropCnt;
        return this;
    }
    public Long getTotalDropCnt() {
        return this.totalDropCnt;
    }

    public DescribeFirewallDropStatisticsResponseBody setVulnDropCnt(Long vulnDropCnt) {
        this.vulnDropCnt = vulnDropCnt;
        return this;
    }
    public Long getVulnDropCnt() {
        return this.vulnDropCnt;
    }

}
