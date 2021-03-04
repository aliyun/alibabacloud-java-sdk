// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeAccountKmsStatusResponseBody extends TeaModel {
    @NameInMap("AccountStatus")
    public String accountStatus;

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
