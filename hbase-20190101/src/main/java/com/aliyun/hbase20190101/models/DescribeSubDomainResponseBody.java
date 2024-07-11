// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSubDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F4208C83-B9BC-4A64-A739-8F88E98DA469</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-h-aliyun</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    public static DescribeSubDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainResponseBody self = new DescribeSubDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

}
