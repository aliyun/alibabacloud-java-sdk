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
     * <p>The status of the NAT border firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong>: The feature is enabled.</p>
     * </li>
     * <li><p><strong>init</strong>: The feature is being enabled.</p>
     * </li>
     * <li><p><strong>closed</strong>: The feature is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of days that protection was disabled. This parameter is returned only when the NAT border firewall is enabled.</p>
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
