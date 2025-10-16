// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserNatStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6B780BD6-282C-51A9-A8E6-59F636******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the NAT Firewall feature. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: enabled</li>
     * <li><strong>init</strong>: being enabled</li>
     * <li><strong>closed</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of days during which no asset is added to the NAT Firewall feature for protection. This parameter is valid only when the value of Status is open.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("UnprotectedDate")
    public Long unprotectedDate;

    public static DescribePostpayUserNatStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserNatStatusResponseBody self = new DescribePostpayUserNatStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserNatStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayUserNatStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePostpayUserNatStatusResponseBody setUnprotectedDate(Long unprotectedDate) {
        this.unprotectedDate = unprotectedDate;
        return this;
    }
    public Long getUnprotectedDate() {
        return this.unprotectedDate;
    }

}
