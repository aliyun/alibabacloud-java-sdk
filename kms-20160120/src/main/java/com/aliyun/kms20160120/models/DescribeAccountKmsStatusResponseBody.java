// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeAccountKmsStatusResponseBody extends TeaModel {
    /**
     * <p>The status of KMS within your Alibaba cloud account. Valid values:</p>
     * <ul>
     * <li><p>Enabled: KMS is enabled.</p>
     * </li>
     * <li><p>NotEnabled: KMS is disabled.</p>
     * </li>
     * <li><p>InDebt: Your account is overdue, and KMS stops providing services.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If your Alibaba Cloud account is overdue, top up your account at the earliest opportunity to avoid impacts on your services.</p>
     * </blockquote>
     * <ul>
     * <li>Suspended: KMS is suspended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("AccountStatus")
    public String accountStatus;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3ac84333-d64d-4784-a8bc-997834a7ac6c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountKmsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountKmsStatusResponseBody self = new DescribeAccountKmsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountKmsStatusResponseBody setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public DescribeAccountKmsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
