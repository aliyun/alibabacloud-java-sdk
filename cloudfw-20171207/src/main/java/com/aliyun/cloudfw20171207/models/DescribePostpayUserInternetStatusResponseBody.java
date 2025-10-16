// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserInternetStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0DC783F1-B3A7-578D-8A63-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the Internet Firewall feature. Valid values:</p>
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
     * <p>The number of days during which no asset is added to the Internet Firewall feature for protection. This parameter is valid only when the value of Status is open.</p>
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
