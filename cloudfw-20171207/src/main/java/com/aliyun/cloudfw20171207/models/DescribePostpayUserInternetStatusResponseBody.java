// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserInternetStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0DC783F1-B3A7-578D-8A63-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the Internet Border firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong>: The firewall is enabled.</p>
     * </li>
     * <li><p><strong>init</strong>: The firewall is being enabled.</p>
     * </li>
     * <li><p><strong>closed</strong>: The firewall is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of days that the firewall was disabled. This parameter is returned only if the value of the Status parameter is open.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("UnprotectedDate")
    public Long unprotectedDate;

    public static DescribePostpayUserInternetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserInternetStatusResponseBody self = new DescribePostpayUserInternetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserInternetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePostpayUserInternetStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePostpayUserInternetStatusResponseBody setUnprotectedDate(Long unprotectedDate) {
        this.unprotectedDate = unprotectedDate;
        return this;
    }
    public Long getUnprotectedDate() {
        return this.unprotectedDate;
    }

}
