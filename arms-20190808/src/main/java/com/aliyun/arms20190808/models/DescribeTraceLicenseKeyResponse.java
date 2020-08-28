// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LicenseKey")
    @Validation(required = true)
    public String licenseKey;

    public static DescribeTraceLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyResponse self = new DescribeTraceLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

}
