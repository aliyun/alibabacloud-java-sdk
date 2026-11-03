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
     * <p>The status of the Internet Border switch module in Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: The module is enabled.</li>
     * <li><strong>init</strong>: The module is being enabled.</li>
     * <li><strong>closed</strong>: The module is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of days that protection is not enabled. This parameter is valid only when the module is enabled.</p>
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
