// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeAccountKmsStatusResponseBody extends TeaModel {
    /**
     * <p>The status of KMS within your Alibaba cloud account. Valid values:</p>
     * <br>
     * <p>*   Enabled: KMS is enabled.</p>
     * <br>
     * <p>*   NotEnabled: KMS is disabled.</p>
     * <br>
     * <p>*   InDebt: Your account is overdue, and KMS stops providing services.</p>
     * <br>
     * <p>> If your Alibaba Cloud account is overdue, top up your account at the earliest opportunity to avoid impacts on your services.</p>
     * <br>
     * <p>*   Suspended: KMS is suspended.</p>
     */
    @NameInMap("AccountStatus")
    public String accountStatus;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
