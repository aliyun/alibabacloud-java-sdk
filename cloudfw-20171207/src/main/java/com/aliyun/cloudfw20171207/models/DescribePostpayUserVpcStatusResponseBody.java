// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserVpcStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7447795A-39AB-52CB-8F92-128DF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the VPC Firewall feature. Valid values:</p>
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
     * <p>The number of days during which no asset is added to the VPC Firewall feature for protection. This parameter is valid only when the value of Status is open.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("UnprotectedDate")
    public Long unprotectedDate;

    public static DescribePostpayUserVpcStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserVpcStatusResponseBody self = new DescribePostpayUserVpcStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserVpcStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayUserVpcStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePostpayUserVpcStatusResponseBody setUnprotectedDate(Long unprotectedDate) {
        this.unprotectedDate = unprotectedDate;
        return this;
    }
    public Long getUnprotectedDate() {
        return this.unprotectedDate;
    }

}
