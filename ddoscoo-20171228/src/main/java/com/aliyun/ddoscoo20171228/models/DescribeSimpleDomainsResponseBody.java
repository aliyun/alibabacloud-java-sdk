// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSimpleDomainsResponseBody extends TeaModel {
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSimpleDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimpleDomainsResponseBody self = new DescribeSimpleDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSimpleDomainsResponseBody setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribeSimpleDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
